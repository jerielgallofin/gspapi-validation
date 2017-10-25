package com.starter88.gspapivalidate.providers.gameplay.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.starter88.gspapivalidate.common.reponse.BaseResponse;


/**
 * w88 CTXM response (validateApi <- provider)
 * @author 김연길
 */
@XmlRootElement(name="resp")
@XmlAccessorType(XmlAccessType.NONE)

public class GameplayValidationResponse extends BaseResponse {
	@XmlElement(name="error_code")
	private String errorCode;
	@XmlElement(name="cust_id")
	private String custId;
	@XmlElement(name="cust_name")
	private String custName;
	@XmlElement(name="currency_code")
	private String currencyCode;
	@XmlElement(name="language")
	private String language;
	@XmlElement(name="test_cust")	
	private String testCust;
	@XmlElement(name="country")
	private String country;
	@XmlElement(name="date_of_birth")
	private String dateOfBirth;
	@XmlElement(name="ip")
	private String ip;
	
	
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	public String getTestCust() {
		return testCust;
	}
	public void setTestCust(String testCust) {
		this.testCust = testCust;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	@Override
	public String toString() {
		return "GPValidateResXmlVo [" + (errorCode != null ? "errorCode=" + errorCode + ", " : "")
				+ (custId != null ? "custId=" + custId + ", " : "")
				+ (custName != null ? "custName=" + custName + ", " : "")
				+ (currencyCode != null ? "currencyCode=" + currencyCode + ", " : "")
				+ (language != null ? "language=" + language + ", " : "")
				+ (testCust != null ? "testCust=" + testCust + ", " : "")
				+ (country != null ? "country=" + country + ", " : "")
				+ (dateOfBirth != null ? "dateOfBirth=" + dateOfBirth + ", " : "") + (ip != null ? "ip=" + ip : "")
				+ "]";
	}

}
