package com.qual.prix.solutions.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.qual.prix.solutions.webstock.domaine.Personne;
import com.qual.prix.solutions.webstock.domaine.ShopObjets;
import com.qual.prix.solutions.webstock.domaine.Utilisateur;
 

@Repository
public class QualPrixSolutionsDaoImpl implements QualPrixSolutionsDao {
	
	@PersistenceContext
	private EntityManager entitymannager;

	@Transactional
	@Override
	public <T> void insertNewUser(T t) {
		// TODO Auto-generated method stub
		entitymannager.persist(t);
	}

	@Transactional
	@Override
	public boolean isAnUserOfSystem(Utilisateur util) {
		// TODO Auto-generated method stub
		int maxuser = entitymannager.createQuery("select util.name from UTILISATEURS util where util.login="+util.getLogin()).getMaxResults();
		return maxuser != 0;
	}

	@Transactional
	@Override
	public List<Utilisateur> findUsersPersonneBy(Utilisateur util) {
		// TODO Auto-generated method stub
		return (List<Utilisateur>) entitymannager.find(Utilisateur.class, util.getLogin());
	}

	@Transactional
	@Override
	public Personne getPersonneByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	public EntityManager getEntitymannager() {
		return entitymannager;
	}

	public void setEntitymannager(EntityManager entitymannager) {
		this.entitymannager = entitymannager;
	}

	@Override
	public List<ShopObjets> findAllShopObjets() {
		 TypedQuery<ShopObjets> query = entitymannager.createQuery("SELECT * FROM SHOPOBJETS", ShopObjets.class);
		return query.getResultList();
	}

	 
}
