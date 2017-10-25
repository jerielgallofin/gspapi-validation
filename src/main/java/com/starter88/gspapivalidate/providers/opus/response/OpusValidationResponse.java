package com.starter88.gspapivalidate.providers.opus.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.starter88.gspapivalidate.common.reponse.BaseResponse;

@XmlRootElement(name = "authenticate")
@XmlAccessorType(XmlAccessType.NONE)
public class OpusValidationResponse extends BaseResponse {

	@XmlElement(name = "status_code")
	private String statusCode;
	@XmlElement(name = "status_text")
	private String statusText;
	@XmlElement(name = "currency")
	private String currency;
	@XmlElement(name = "member_id")
	private String memberId;
	@XmlElement(name = "member_name")
	private String memberName;
	@XmlElement(name = "language")
	private String language;
	@XmlElement(name = "datetime")
	private String datetime;
	@XmlElement(name = "member_type")
	private String memberType;

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusText() {
		return statusText;
	}

	public void setStatusText(String statusText) {
		this.statusText = statusText;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public String getMemberType() {
		return memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

}
