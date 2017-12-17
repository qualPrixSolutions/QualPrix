package com.qual.prix.solutions.webstock.domaine;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
 
 

@Entity(name="PERSONNES")
public class Personne implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3435953760859942986L;

	@EmbeddedId
	PersonneKey personnekey;
	
	@OneToMany(orphanRemoval=true,mappedBy="personne",fetch=FetchType.LAZY,cascade={CascadeType.ALL})
	private Set<Utilisateur> utilisateur = new HashSet<>();
	
	@ManyToOne(fetch = FetchType.LAZY,cascade={CascadeType.ALL})
	@JoinColumn(name="ID_ADRES",nullable = false)
	private Adresse adresse;

	public Personne() {
		super();
	}

	public Personne(PersonneKey personnekey, Set<Utilisateur> utilisateur, Adresse adresse) {
		super();
		this.personnekey = personnekey;
		this.utilisateur = utilisateur;
		this.adresse = adresse;
	}

	public PersonneKey getPersonnekey() {
		return personnekey;
	}

	public void setPersonnekey(PersonneKey personnekey) {
		this.personnekey = personnekey;
	}

	public Set<Utilisateur> getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Set<Utilisateur> utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Personne [personnekey=" + personnekey + ", utilisateur=" + utilisateur + ", adresse=" + adresse + "]";
	}

 
}
