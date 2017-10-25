package com.starter88.gspapivalidate.providers.cmd.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.starter88.gspapivalidate.common.reponse.BaseResponse;


@XmlRootElement(name="authenticate")
@XmlAccessorType(XmlAccessType.NONE)
public class CmdValidationResponse extends BaseResponse {
	
	@XmlElement(name="member_id")
	private String memberId;
	
	@XmlElement(name="status_code")
	private String statusCode;
	
	@XmlElement(name="message")
	private String message;

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	
	
}
