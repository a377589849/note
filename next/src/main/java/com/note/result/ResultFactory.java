package com.note.result;

public class ResultFactory {
	
	public static Result buildSuccessResult(Object data) {
		return buildResult(ResultCode.SUCCESS,"成功",data);
	}
	
	public static Result buileFailResult(String message) {
		return buildResult(ResultCode.FAIL,message,null);
	}
	
	public static Result buildResult(ResultCode resultCode,String message,Object data) {
		return buildResult(resultCode, message, data);
	}
	
	public static Result buildResult(int resultCode,String message,Object data) {
		return buildResult(resultCode, message, data);
	}

}
