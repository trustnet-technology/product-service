package com.trustnet.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class TrustnetRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	public Object save(Object entity) {
		entityManager.persist(entity);
		entityManager.flush();
		return entity;
	}
	
	public void update(Object entity) {
		entityManager.merge(entity);
	}
	
	public Object findById(Object id, Class<?> t) {
		return entityManager.find(t, id);
	}
	
	public List<?> findAll(Class<?> t){
		return entityManager.createQuery("Select t from "+t.getSimpleName() +" t").getResultList();
	}
	
	public List<?> findRecord(String query) {
			return entityManager.createNativeQuery(query).getResultList();
			
	}
	public List<?> findRecords(String query, Class<?> clazz) {
		return entityManager.createNativeQuery(query, clazz).getResultList();
		
}
	
	
}
