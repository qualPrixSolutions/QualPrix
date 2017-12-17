package com.qual.prix.solutions.services;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qual.prix.solutions.dao.QualPrixSolutionsDao;
import com.qual.prix.solutions.webstock.domaine.Adresse;
import com.qual.prix.solutions.webstock.domaine.InformationsUtilisateur;
import com.qual.prix.solutions.webstock.domaine.Personne;
import com.qual.prix.solutions.webstock.domaine.PersonneKey;
import com.qual.prix.solutions.webstock.domaine.ShopObjets;
import com.qual.prix.solutions.webstock.domaine.Utilisateur;

@Service
public class QualPrixSolutionsServiceImpl implements QualPrixSolutionsService{
	
	@Autowired
	private QualPrixSolutionsDao qualPrixSolDao;

	@Override
	public void creerNouveauUtilisateur(InformationsUtilisateur infoUtil) {
		
		//Personne  est different de client 
		Personne infosPers = new Personne();
		
		PersonneKey pk = new PersonneKey();
		pk.setNom(infoUtil.getFirstname());
		pk.setPrenom(infoUtil.getLastName());
		pk.setEmail(infoUtil.getEmail());
		pk.setDateNaissance(infoUtil.getBirthday());
		
		infosPers.setPersonnekey(pk);
		
		//insertion du login et password de l'utilsateur
		Utilisateur util = new Utilisateur();
		util.setLogin(infoUtil.getLogin());
		util.setPassword(infoUtil.getPassword());
		util.setPersonne(infosPers);
		infosPers.getUtilisateur().add(util);
		
		//adresse de l'utilisateur
		Adresse adresse = new Adresse();
		adresse.setCodePostale(infoUtil.getCodePostal());
		adresse.setPays(infoUtil.getCountry());
		adresse.setRue(infoUtil.getStreet());
		adresse.setVille(infoUtil.getStreet());
		adresse.setStreetNumber(infoUtil.getStreetNumber());
		
		infosPers.setAdresse(adresse);
		
		qualPrixSolDao.insertNewUser(infosPers);
     		
	}

	public QualPrixSolutionsDao getQualPrixSolDao() {
		return qualPrixSolDao;
	}

	public void setQualPrixSolDao(QualPrixSolutionsDao qualPrixSolDao) {
		this.qualPrixSolDao = qualPrixSolDao;
	}

	@Override
	public List<ShopObjets> getObjetsShop() {
		return qualPrixSolDao.findAllShopObjets();
	}
 
}
