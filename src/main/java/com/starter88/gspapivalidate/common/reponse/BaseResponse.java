package com.starter88.gspapivalidate.common.reponse;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class BaseResponse {
	
	@Override
	public boolean equals(Object o) {
        return EqualsBuilder.reflectionEquals(this, o);
    }	
	
	@Override
	public String toString() {
	    return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
	
	@Override
	public int hashCode() {
	        return HashCodeBuilder.reflectionHashCode(this);
    }
}
