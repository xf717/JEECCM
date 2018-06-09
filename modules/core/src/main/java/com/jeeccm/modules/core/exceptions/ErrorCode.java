package com.jeeccm.modules.core.exceptions;

/**
* 类名：ErrorCode.java <br>
* 描述：<br>
* 创建者：XINJF<br>
* 创建日期：<br>
* 版本：1.0<br>
* 修改者：<br>
* 修改日期：<br>
*/
public enum ErrorCode {

	BAD_REQUEST(400, 400), UNAUTHORIZED(401, 401), FORBIDDEN(403, 403), INTERNAL_SERVER_ERROR(500, 500),

	BOOK_STATUS_WRONG(1100, 400), BOOK_OWNERSHIP_WRONG(1101, 403), NO_TOKEN(1102, 401), BOOK_NOT_EXTIS(1103,
			403), IS_APPLY(332, 200), IS_TEN_MINUTES(339, 200), CLIENT_ERROR(301, 400), BORROW_STORE_DOWN(328,
					400), LIB_BOOK_BRROW(334, 400), BORROW_TO_OTHER(325, 400), BORROW_APPLY_SEND(323, 400),BOOK_FILEMD5(324,400),SIGN_ERROR(1104,401);

	public int code;
	public int httpStatus;

	ErrorCode(int code, int httpStatus) {
		this.code = code;
		this.httpStatus = httpStatus;
	}

}
