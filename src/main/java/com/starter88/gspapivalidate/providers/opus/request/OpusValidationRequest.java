package com.starter88.gspapivalidate.providers.opus.request;

public class OpusValidationRequest {

	private String secret_key;
	private String operator_id;
	private String site_code;
	private String product_code;
	private String session_token;

	public OpusValidationRequest() {

	}

	public OpusValidationRequest(String secret_key, String operator_id, String site_code, String product_code, String session_token) {
		this.secret_key = secret_key;
		this.operator_id = operator_id;
		this.site_code = site_code;
		this.product_code = product_code;
		this.session_token = session_token;
	}

	public String getSecret_key() {
		return secret_key;
	}

	public void setSecret_key(String secret_key) {
		this.secret_key = secret_key;
	}

	public String getOperator_id() {
		return operator_id;
	}

	public void setOperator_id(String operator_id) {
		this.operator_id = operator_id;
	}

	public String getSite_code() {
		return site_code;
	}

	public void setSite_code(String site_code) {
		this.site_code = site_code;
	}

	public String getProduct_code() {
		return product_code;
	}

	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}

	public String getSession_token() {
		return session_token;
	}

	public void setSession_token(String session_token) {
		this.session_token = session_token;
	}

}
