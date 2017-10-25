package com.starter88.gspapivalidate.persistence.dao.member;
// default package

// Generated Jul 15, 2016 4:07:29 PM by Hibernate Tools 5.1.0.Alpha1

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

import com.starter88.gspapivalidate.persistence.entity.member.Member;


@Repository
public class MemberDAO {

	private static final Log log = LogFactory.getLog(MemberDAO.class);

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Save member record to database
	 * 
	 * @param entity
	 * @return
	 */
	public Member persist(Member entity) {
		try {
			entityManager.persist(entity);
		} catch (RuntimeException re) {
			throw re;
		}
		return entity;
	}

	/**
	 * Update the member record
	 * 
	 * @param data
	 * @return
	 */
	public Member updateHistory(Member entity) {
		try {
			return entityManager.merge(entity);
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/**
	 * Method used to check record existence
	 * 
	 * @param uniqueConstraintNameValueMap
	 * @param clazz
	 * @return
	 */
	public <T extends Member> boolean findByUniqueConstraint(Map<String, String> uniqueConstraintNameValueMap,
			Class<T> clazz) {
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<Long> cq = cb.createQuery(Long.class);
		Root<T> from = cq.from(clazz);
		ArrayList<Predicate> predicateList = new ArrayList<>();
		for (Map.Entry<String, String> entry : uniqueConstraintNameValueMap.entrySet()) {
			Predicate id = cb.equal(from.get(entry.getKey()), entry.getValue());
			predicateList.add(id);
		}
		CriteriaQuery<Long> select = cq.select(cb.count(from));
		cq.where(predicateList.toArray(new Predicate[predicateList.size()]));
		TypedQuery<Long> typedQuery = entityManager.createQuery(select);
		return typedQuery.setHint("org.hibernate.cacheable", true).setHint("org.hibernate.cacheMode", "NORMAL")
				.getSingleResult() > 0;
	}

	/**
	 * Get member by memberId
	 * 
	 * @param memberId
	 * @param clazz
	 * @return
	 */
	public <T extends Member> T getMemberById(String memberId, Class<T> clazz) {
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<T> cq = cb.createQuery(clazz);
		Root<T> from = cq.from(clazz);
		Predicate id = cb.equal(from.get("memberId"), memberId);
		cq.where(id);
		CriteriaQuery<T> select = cq.select(from);
		TypedQuery<T> typedQuery = entityManager.createQuery(select);
		return typedQuery.setHint("org.hibernate.cacheable", true).setHint("org.hibernate.cacheMode", "NORMAL")
				.getSingleResult();
	}
	
	/**
	 * Get member by memberId
	 * 
	 * @param memberId
	 * @param clazz
	 * @return
	 */
	public <T extends Member> T getMemberByToken(String token, Class<T> clazz) {
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<T> cq = cb.createQuery(clazz);
		Root<T> from = cq.from(clazz);
		Predicate id = cb.equal(from.get("token"), token);
		cq.where(id);
		CriteriaQuery<T> select = cq.select(from);
		TypedQuery<T> typedQuery = entityManager.createQuery(select);
		return typedQuery.setHint("org.hibernate.cacheable", true).setHint("org.hibernate.cacheMode", "NORMAL")
				.getSingleResult();
	}

	/**
	 * @param predicatesMap
	 * @param clazz
	 * @return
	 */
	public <T extends Member> List<T> getMemberByColumn(Map<String, String> predicatesMap, Class<T> clazz) {
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<T> cq = cb.createQuery(clazz);
		Root<T> from = cq.from(clazz);

		List<Predicate> predicateList = new ArrayList<>();
		for (Entry<String, String> entry : predicatesMap.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();

			predicateList.add(cb.equal(from.get(key), value));
		}

		cq.where(cb.and(predicateList.toArray(new Predicate[predicateList.size()])));
		CriteriaQuery<T> select = cq.select(from);
		TypedQuery<T> typedQuery = entityManager.createQuery(select);
		return typedQuery.setHint("org.hibernate.cacheable", true).setHint("org.hibernate.cacheMode", "NORMAL")
				.getResultList();
	}

	/**
	 * Get all members
	 * 
	 * @param clazz
	 * @return
	 */
	public <T extends Member> List<T> getMembers(Class<T> clazz) {
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<T> cq = cb.createQuery(clazz);
		Root<T> rootEntry = cq.from(clazz);
		CriteriaQuery<T> all = cq.select(rootEntry);
		TypedQuery<T> allQuery = entityManager.createQuery(all);
		return allQuery.setHint("org.hibernate.cacheable", true).setHint("org.hibernate.cacheMode", "NORMAL")
				.getResultList();
	}

}
