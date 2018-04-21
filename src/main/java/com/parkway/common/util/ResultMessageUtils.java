package com.parkway.common.util;

import org.json.JSONException;

import com.parkway.core.dataobject.Result;
import com.parkway.core.exception.InputValidationException;
import com.parkway.core.exception.SessionExpiredException;
import com.parkway.core.util.DataObjectUtil;
import com.parkway.core.util.JsonUtil;

public class ResultMessageUtils {
	
	public static String getErrorResult (Exception exception) {
		if(exception instanceof SessionExpiredException) {
			return getErrorResult(ErrorCodes.SERVER_ERROR_CODE_SESSION_EXPIRED, "Session Expired");
		}else if(exception instanceof InputValidationException) {
			return getErrorResult("Invalid request for service");
		}else {
			return Constants.ERROR_MESSAGE_GENERIC;
		}		
	}
	
	public static String getErrorResult(String errorMessage) {
		return getErrorResult(ErrorCodes.SERVER_ERROR_CODE_GENERIC, errorMessage);
	}
	
	public static String getErrorResult(String errorCode, String errorMessage) {
		Result result = new Result();
		DataObjectUtil.setParam(result,ConstantsKeys.STATUS,Constants.RESULT_STATUS_CODE);
		DataObjectUtil.setParam(result,ConstantsKeys.ERROR_CODE,errorCode);
		DataObjectUtil.setParam(result,ConstantsKeys.ERROR_MESSAGE,errorMessage);
		try {
			return JsonUtil.convert(result);
		} catch (JSONException e) {
			return getDefaultErrorResult();
		}
	}
	
	public static String getDefaultErrorResult() {
		return Constants.ERROR_MESSAGE_GENERIC;
	}

}
