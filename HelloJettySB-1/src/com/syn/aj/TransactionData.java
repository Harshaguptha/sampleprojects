package com.syn.aj;

import java.util.Date;

public class TransactionData {

	private String level;
	private Date timeStamp;
	private Long id;
	private String appId;
	private int appSequnceNumber;
	private int sequence;
	private String  location;
	private String classname;
	private String methodName;
	private int lineNumber;
	private String inputs;
	private long timeTook;
	private String result;
	private String stackTrace;
	
	
	public TransactionData(String level, Date timeStamp, Long id, String appId,
			int appSequnceNumber, int sequence, String location,
			String classname, String methodName, int lineNumber, String inputs,
			long timeTook, String result, String stackTrace) {
		super();
		this.level = level;
		this.timeStamp = timeStamp;
		this.id = id;
		this.appId = appId;
		this.appSequnceNumber = appSequnceNumber;
		this.sequence = sequence;
		this.location = location;
		this.classname = classname;
		this.methodName = methodName;
		this.lineNumber = lineNumber;
		this.inputs = inputs;
		this.timeTook = timeTook;
		this.result = result;
		this.stackTrace = stackTrace;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public int getAppSequnceNumber() {
		return appSequnceNumber;
	}
	public void setAppSequnceNumber(int appSequnceNumber) {
		this.appSequnceNumber = appSequnceNumber;
	}
	public int getSequence() {
		return sequence;
	}
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getMethodName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	public int getLineNumber() {
		return lineNumber;
	}
	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	public String getInputs() {
		return inputs;
	}
	public void setInputs(String inputs) {
		this.inputs = inputs;
	}
	public long getTimeTook() {
		return timeTook;
	}
	public void setTimeTook(long timeTook) {
		this.timeTook = timeTook;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getStackTrace() {
		return stackTrace;
	}
	public void setStackTrace(String stackTrace) {
		this.stackTrace = stackTrace;
	}
	
	
	
}
