package com.qual.prix.solutions.webstock.domaine;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Table(schema = "QUALPRIX", name = "CONTACTS", uniqueConstraints = {
		@UniqueConstraint(columnNames = {"CONTS_ID", "NOM", "PRENOM","TELEPHONE","EMAIL","MESSAGE" }) })
public class Contacts implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5547309621574557000L;
	
	@Id
	@SequenceGenerator(name="QUALPRIXSOL_CONTACTS_SEQ", sequenceName="qual_contacts_id_seq")
	@GeneratedValue(strategy = GenerationType.AUTO ,generator="QUALPRIXSOL_CONTACTS_SEQ")
	private Long id;
	
	@Column(name = "NOM", nullable = false, updatable = true, insertable = true, unique = false)
	private String nom;
	
	@Column(name = "PRENOM", nullable = false, updatable = true, insertable = true, unique = false)
	private String prenom;
	
	@Column(name = "TELEPHONE", nullable = false, updatable = true, insertable = true, unique = false)
	private String telephone;
	
	@Column(name = "EMAIL", nullable = false, updatable = true, insertable = true, unique = false)
	private String email;
	
	@Column(name = "MESSAGE", nullable = false, updatable = true, insertable = true, unique = false)
	private String  message;

	public Contacts() {
		super();
	}

	public Contacts(String nom, String prenom, String telephone, String email, String message) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.email = email;
		this.message = message;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		result = prime * result + ((telephone == null) ? 0 : telephone.hashCode());
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
		Contacts other = (Contacts) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		if (telephone == null) {
			if (other.telephone != null)
				return false;
		} else if (!telephone.equals(other.telephone))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Contacts [nom=" + nom + ", prenom=" + prenom + ", telephone=" + telephone + ", email=" + email
				+ ", message=" + message + "]";
	}
	
}
