package com.starter88.gspapivalidate.persistence.dao.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.starter88.gspapivalidate.persistence.dao.member.MemberDAO;

/**
 * 
 * PersistenceService
 *
 */
@Service
@Transactional
public class PersistenceService {
	
	private Logger log = LoggerFactory.getLogger(PersistenceService.class);
	
	private MemberDAO memberDAO;
	
	@Autowired
	public PersistenceService(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

	public MemberDAO getMemberDAO() {
		return memberDAO;
	}

}
