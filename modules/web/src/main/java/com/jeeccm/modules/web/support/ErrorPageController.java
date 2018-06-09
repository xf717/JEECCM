package com.jeeccm.modules.web.support;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.WebRequest;
import org.springside.modules.utils.mapper.JsonMapper;
import org.springside.modules.web.MediaTypes;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * 重载替换Spring Boot默认的BasicErrorController, 增加日志并让错误返回方式统一.
 * 
 */
@Controller
public class ErrorPageController implements ErrorController {

	private static Logger logger = LoggerFactory.getLogger(ErrorPageController.class);

	@Value("${error.path:/error}")
	private String errorPath;

	private JsonMapper jsonMapper = new JsonMapper();

	private ErrorAttributes errorAttributes = new DefaultErrorAttributes();

	@RequestMapping(value = "${error.path:/error}", produces = MediaTypes.JSON_UTF_8)
	@ResponseBody
	public ErrorResult handle(HttpServletRequest request) {
		Map<String, Object> attributes = getErrorAttributes(request);

		ErrorResult result = new ErrorResult();
		result.code = (int) attributes.get("status");
		result.message = (String) attributes.get("error");

		logError(attributes, request);

		return result;
	}

	private Map<String, Object> getErrorAttributes(HttpServletRequest request) {
		RequestAttributes requestAttributes = new ServletRequestAttributes(request);
		return this.errorAttributes.getErrorAttributes((WebRequest) requestAttributes, false);
	}

	private void logError(Map<String, Object> attributes, HttpServletRequest request) {
		attributes.put("from", request.getRemoteAddr());
		logger.error(jsonMapper.toJson(attributes));
	}

	@Override
	public String getErrorPath() {
		return this.errorPath;
	}
}
