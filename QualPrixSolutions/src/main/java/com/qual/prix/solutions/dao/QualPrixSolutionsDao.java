package com.qual.prix.solutions.dao;

import java.util.List;

import com.qual.prix.solutions.webstock.domaine.Personne;
import com.qual.prix.solutions.webstock.domaine.ShopObjets;
import com.qual.prix.solutions.webstock.domaine.Utilisateur;

 

public interface QualPrixSolutionsDao {
	
    <T> void insertNewUser(T t);
     boolean isAnUserOfSystem(Utilisateur util);
     List<Utilisateur> findUsersPersonneBy(Utilisateur util);
     Personne getPersonneByUserName(String userName);
     List<ShopObjets> findAllShopObjets();

}
