package com.jeeccm.modules.core.exceptions;

/**
* 类名：ServiceException.java <br>
* 描述：<br>
* 创建者：XINJF<br>
* 创建日期：<br>
* 版本：1.0<br>
* 修改者：<br>
* 修改日期：<br>
*/
public class ServiceException extends RuntimeException {

	private static final long serialVersionUID = -8634700792767837033L;

	public ErrorCode errorCode;

	public ServiceException(String message, ErrorCode errorCode) {
		super(message);
		this.errorCode = errorCode;
	}
}
