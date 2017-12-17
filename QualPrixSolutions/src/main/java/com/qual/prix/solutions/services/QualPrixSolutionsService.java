package com.qual.prix.solutions.services;

 
import java.util.List;

import com.qual.prix.solutions.webstock.domaine.InformationsUtilisateur;
import com.qual.prix.solutions.webstock.domaine.ShopObjets;

public interface  QualPrixSolutionsService {
	
	 
	void creerNouveauUtilisateur(InformationsUtilisateur  infoUtil);
	
	List<ShopObjets> getObjetsShop();

}
