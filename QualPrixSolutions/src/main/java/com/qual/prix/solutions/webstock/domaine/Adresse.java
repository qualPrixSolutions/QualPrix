package com.qual.prix.solutions.webstock.domaine;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
 

@Entity(name="ADRESSES")
public class Adresse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 480397111025214254L;
	
	 
	@Id
	@SequenceGenerator(name="qual_personne_seq", sequenceName="qual_addresse_id_seq")
	@GeneratedValue(strategy = GenerationType.AUTO ,generator="qual_personne_seq")
	@Column(name="ID_ADRES",nullable = false, updatable = false, insertable = true, unique = false)
	private Long id;

	@Column(name = "country", nullable = false, updatable = true, insertable = true, unique = false)
	private String pays;

	@Column(name = "codePostal", nullable = false, updatable = true, insertable = true, unique = false)
	private String codePostale;

	@Column(name = "street", nullable = false, updatable = true, insertable = true, unique = false)
	private String rue;

	@Column(name = "city", nullable = false, updatable = true, insertable = true, unique = false)
	private String ville;
	
	@Column(name = "streetnumber", nullable = false, updatable = true, insertable = true, unique = false)
	private Integer streetNumber;


	@OneToMany(orphanRemoval=true,mappedBy="adresse",fetch=FetchType.LAZY,cascade={CascadeType.ALL})
	private List<Personne> personnes = new ArrayList<>();

	 
	public Adresse(String pays, String codePostale, String rue, String ville, Integer streetNumber,
			List<Personne> personnes) {
		super();
		this.pays = pays;
		this.codePostale = codePostale;
		this.rue = rue;
		this.ville = ville;
		this.streetNumber = streetNumber;
		this.personnes = personnes;
	}
	

	public Adresse() {
		super();
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getCodePostale() {
		return codePostale;
	}

	public void setCodePostale(String codePostale) {
		this.codePostale = codePostale;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
 
	public List<Personne>  getUtisateur() {
		return personnes;
	}

	public void setUtisateur(List<Personne> personnes) {
		this.personnes = personnes;
	}


	public Integer getStreetNumber() {
		return streetNumber;
	}


	public void setStreetNumber(Integer streetNumber) {
		this.streetNumber = streetNumber;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codePostale == null) ? 0 : codePostale.hashCode());
		result = prime * result + ((pays == null) ? 0 : pays.hashCode());
		result = prime * result + ((personnes == null) ? 0 : personnes.hashCode());
		result = prime * result + ((rue == null) ? 0 : rue.hashCode());
		result = prime * result + ((streetNumber == null) ? 0 : streetNumber.hashCode());
		result = prime * result + ((ville == null) ? 0 : ville.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Adresse other = (Adresse) obj;
		if (codePostale == null) {
			if (other.codePostale != null)
				return false;
		} else if (!codePostale.equals(other.codePostale))
			return false;
		if (pays == null) {
			if (other.pays != null)
				return false;
		} else if (!pays.equals(other.pays))
			return false;
		if (personnes == null) {
			if (other.personnes != null)
				return false;
		} else if (!personnes.equals(other.personnes))
			return false;
		if (rue == null) {
			if (other.rue != null)
				return false;
		} else if (!rue.equals(other.rue))
			return false;
		if (streetNumber == null) {
			if (other.streetNumber != null)
				return false;
		} else if (!streetNumber.equals(other.streetNumber))
			return false;
		if (ville == null) {
			if (other.ville != null)
				return false;
		} else if (!ville.equals(other.ville))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Adresse [pays=" + pays + ", codePostale=" + codePostale + ", rue=" + rue + ", ville=" + ville
				+ ", streetNumber=" + streetNumber + ", personnes=" + personnes + "]";
	}

	
}
