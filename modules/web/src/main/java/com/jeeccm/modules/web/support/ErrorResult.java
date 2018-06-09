package com.jeeccm.modules.web.support;

/**
 * 类名：ErrorResult.java<br>
 * 描述：<br>
 * 创建者：XINJF<br>
 * 创建日期：2018年4月11日 上午11:58:37<br>
 * 版本：1.0<br>
 * 修改者：<br>
 * 修改日期：<br>
 */
public class ErrorResult {

	public int code;
	public String message;

	public ErrorResult() {
	}

	public ErrorResult(int code, String message) {
		this.code = code;
		this.message = message;
	}
}