package com.starter88.gspapivalidate.persistence.entity.member.opus;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.starter88.gspapivalidate.persistence.entity.member.Member;

@Entity
@Table(name = "tb_member_opus")
public class MemberOpus implements java.io.Serializable, Member {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2664884016168334526L;
	private Long idx;
	private int merchId;
	private String memberId;
	private String token;
	private String requestIp;
	private String birthDay;
	private String language;
	private String currency;
	private String countryCode;
	private Date regDate;

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idx", unique = true, nullable = false)
	public Long getIdx() {
		return this.idx;
	}

	public void setIdx(Long idx) {
		this.idx = idx;
	}

	@Column(name = "merch_id")
	public int getMerchId() {
		return this.merchId;
	}

	public void setMerchId(int merchId) {
		this.merchId = merchId;
	}

	@Column(name = "member_id")
	public String getMemberId() {
		return this.memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	@Column(name = "token")
	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Column(name = "request_ip")
	public String getRequestIp() {
		return this.requestIp;
	}

	public void setRequestIp(String requestIp) {
		this.requestIp = requestIp;
	}

	@Column(name = "birth_day")
	public String getBirthDay() {
		return this.birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	@Column(name = "language")
	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Column(name = "currency")
	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Column(name = "country_code")
	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "reg_date")
	public Date getRegDate() {
		return this.regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

}
