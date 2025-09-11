package com.example.demo.details;

import java.util.Date;
import java.util.List;

public class ErrorDetails {
	
	private Date timeStamp;
	private String message;
	private String detail;
	private List<String> stackTrace;
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public List<String> getStackTrace() {
		return stackTrace;
	}
	public void setStackTrace(List<String> stackTrace) {
		this.stackTrace = stackTrace;
	}
	public ErrorDetails(Date timeStamp, String message, String detail) {
		super();
		this.timeStamp = timeStamp;
		this.message = message;
		this.detail = detail;
	}
	
	
	

}
