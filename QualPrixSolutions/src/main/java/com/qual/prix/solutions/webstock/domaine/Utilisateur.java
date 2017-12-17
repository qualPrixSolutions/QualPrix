package com.qual.prix.solutions.webstock.domaine;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumns;

@Entity(name="UTILISATEURS")
public class Utilisateur implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2524240137276947837L;

	@Id
	@Column(name = "login", nullable = false)
	private String login;
    
	@Column(name = "password", nullable = false)
	private String password;

	@ManyToOne(fetch = FetchType.LAZY,cascade={CascadeType.ALL})
	@JoinColumns({
		    @JoinColumn(name="UFIRSTNAME", referencedColumnName="FIRSTNAME",nullable=false),
		    @JoinColumn(name="ULASTNAME", referencedColumnName="LASTNAME",nullable=false),
		    @JoinColumn(name="UBIRTHDAY", referencedColumnName="BIRTHDAY",nullable=false),
		    @JoinColumn(name="UEMAIL", referencedColumnName="EMAIL",nullable=false)
		})
	private Personne personne;

	public Utilisateur(String login, String password, Personne personne) {
		super();
		this.login = login;
		this.password = password;
		this.personne = personne;
	}

	public Utilisateur() {
		super();
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((personne == null) ? 0 : personne.hashCode());
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
		Utilisateur other = (Utilisateur) obj;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (personne == null) {
			if (other.personne != null)
				return false;
		} else if (!personne.equals(other.personne))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Utilisateur [login=" + login + ", password=" + password + ", personne=" + personne + "]";
	}

	 
}
