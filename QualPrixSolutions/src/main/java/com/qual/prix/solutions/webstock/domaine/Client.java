package com.qual.prix.solutions.webstock.domaine;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
 
 
 

 

@Entity(name = "CLIENTS")
public class Client implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "QUALPRIXSOL_CLIENTS_SEQ", sequenceName = "qual_clients_id_seq")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "QUALPRIXSOL_CLIENTS_SEQ")
	@Column(name = "CLIENTID", nullable = false)
	private Long clientId;

	@Column(name = "CLIENTFIRSTNAME", nullable = false, updatable = true, insertable = true, unique = false)
	private String clientFirstName;

	@Column(name = "CLIENTLASTNAME", nullable = false, updatable = true, insertable = true, unique = false)
	private String clientLastName;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="LOGIN",nullable=true)
	private Utilisateur utilisateur;

	@Column(name = "COMMENTS", nullable = false, updatable = true, insertable = true, unique = false)
	private String comment;

	@Column(name = "PHONENUMBER", nullable = false, updatable = true, insertable = true, unique = false)
	private String numberTel;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ID_ADRES")
	private Adresse addres;

	@Column(name = "VERSION", nullable = false, updatable = true, insertable = true, unique = false)
	private String version;

	@OneToMany(orphanRemoval = true, fetch = FetchType.LAZY, mappedBy = "owner")
	private List<Commande> listCommandes = new ArrayList<>();

	public Client() {
		super();
	}

	public Client(String clientFirstName, String clientLastName, Utilisateur utilisateur, String comment,
			String numberTel, Adresse addres, String version) {
		super();
		this.clientFirstName = clientFirstName;
		this.clientLastName = clientLastName;
		this.utilisateur = utilisateur;
		this.comment = comment;
		this.numberTel = numberTel;
		this.addres = addres;
		this.version = version;
	}

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	public String getClientFirstName() {
		return clientFirstName;
	}

	public void setClientFirstName(String clientFirstName) {
		this.clientFirstName = clientFirstName;
	}

	public String getClientLastName() {
		return clientLastName;
	}

	public void setClientLastName(String clientLastName) {
		this.clientLastName = clientLastName;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getNumberTel() {
		return numberTel;
	}

	public void setNumberTel(String numberTel) {
		this.numberTel = numberTel;
	}

	public Adresse getAddres() {
		return addres;
	}

	public void setAddres(Adresse addres) {
		this.addres = addres;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addres == null) ? 0 : addres.hashCode());
		result = prime * result + ((clientFirstName == null) ? 0 : clientFirstName.hashCode());
		result = prime * result + ((clientId == null) ? 0 : clientId.hashCode());
		result = prime * result + ((clientLastName == null) ? 0 : clientLastName.hashCode());
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((numberTel == null) ? 0 : numberTel.hashCode());
		result = prime * result + ((utilisateur == null) ? 0 : utilisateur.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
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
		Client other = (Client) obj;
		if (addres == null) {
			if (other.addres != null)
				return false;
		} else if (!addres.equals(other.addres))
			return false;
		if (clientFirstName == null) {
			if (other.clientFirstName != null)
				return false;
		} else if (!clientFirstName.equals(other.clientFirstName))
			return false;
		if (clientId == null) {
			if (other.clientId != null)
				return false;
		} else if (!clientId.equals(other.clientId))
			return false;
		if (clientLastName == null) {
			if (other.clientLastName != null)
				return false;
		} else if (!clientLastName.equals(other.clientLastName))
			return false;
		if (comment == null) {
			if (other.comment != null)
				return false;
		} else if (!comment.equals(other.comment))
			return false;
		if (numberTel == null) {
			if (other.numberTel != null)
				return false;
		} else if (!numberTel.equals(other.numberTel))
			return false;
		if (utilisateur == null) {
			if (other.utilisateur != null)
				return false;
		} else if (!utilisateur.equals(other.utilisateur))
			return false;
		if (version == null) {
			if (other.version != null)
				return false;
		} else if (!version.equals(other.version))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Client [clientFirstName=" + clientFirstName + ", clientLastName=" + clientLastName + ", utilisateur="
				+ utilisateur + ", comment=" + comment + ", numberTel=" + numberTel + ", addres=" + addres
				+ ", version=" + version + "]";
	}

}
