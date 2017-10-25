package com.starter88.gspapivalidate.providers.cmd.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.starter88.gspapivalidate.common.util.ComUtil;
import com.starter88.gspapivalidate.persistence.dao.service.PersistenceService;
import com.starter88.gspapivalidate.persistence.entity.member.cmd.MemberCmd;
import com.starter88.gspapivalidate.providers.cmd.response.CmdValidationResponse;

@Service
public class CmdValidationService {
	
	Logger log = LoggerFactory.getLogger(CmdValidationService.class);
	
	private PersistenceService persistenceService;
	
	private static final String TOKEN_INVALID_CODE = "2";
	private static final String TOKEN_INVALID_TEXT = "Token invalid";
	
	@Autowired
	public CmdValidationService(PersistenceService persistenceService) {
		this.persistenceService = persistenceService;
	}

	@Transactional(isolation=Isolation.DEFAULT, propagation=Propagation.REQUIRED,rollbackFor = Exception.class)
	public String validate(String token) throws Exception {
		
		CmdValidationResponse response = new CmdValidationResponse();
		MemberCmd member = persistenceService.getMemberDAO().getMemberByToken(token, MemberCmd.class);
		
		if (member == null) {
			response.setStatusCode(TOKEN_INVALID_CODE);
			response.setMessage(TOKEN_INVALID_TEXT);
			return ComUtil.getObjectToXml(response);
		}
		
		if (!token.equals(member.getToken())) {
			response.setStatusCode(TOKEN_INVALID_CODE);
			response.setMessage(TOKEN_INVALID_TEXT);
			return ComUtil.getObjectToXml(response);
		}
		
		response.setMemberId(member.getMemberId());
		response.setStatusCode("0");
		response.setMessage("OK");
		
		
		return ComUtil.getObjectToXml(response);
	}

}
