package com.qual.prix.solutions.webstock.domaine;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
 
 

@Entity(name="COMMANDE")
public class Commande implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	 @Id
	 @SequenceGenerator(name="QUALPRIXSOL_COMMANDE_SEQ", sequenceName="qual_commande_id_seq")
	 @GeneratedValue(strategy = GenerationType.AUTO ,generator="QUALPRIXSOL_COMMANDE_SEQ")
	 @Column(name = "commandeId", nullable = false)
	 private Long commandeId;
	 
	 @OneToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name = "ARTICLEID")
	 private Article article;
	 
	 @Temporal(value = TemporalType.DATE)
	 @Column(name = "DATECOMMANDE", nullable = false, updatable = true, insertable = true, unique = false)
	 private Date dateCommande;
	 
	 @Column(name = "ETATCOMMANDE", nullable = false, updatable = true, insertable = true, unique = false)
	 private String etatCommande;
	 
	 @Column(name = "QUANTITE", nullable = false, updatable = true, insertable = true, unique = false)
	 private int quantite;
	 
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name="CLIENTID",insertable=false,updatable=false)
	 private Client owner;
	 
	 @Column(name = "VERSION", nullable = false, updatable = true, insertable = true, unique = false)
	 private String version;

	public Commande(Article article, Date dateCommande, String etatCommande, int quantite, Client owner,
			String version) {
		super();
		this.article = article;
		this.dateCommande = dateCommande;
		this.etatCommande = etatCommande;
		this.quantite = quantite;
		this.owner = owner;
		this.version = version;
	}

	public Commande() {
		super();
	}

	public Long getCommandeId() {
		return commandeId;
	}

	public void setCommandeId(Long commandeId) {
		this.commandeId = commandeId;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public String getEtatCommande() {
		return etatCommande;
	}

	public void setEtatCommande(String etatCommande) {
		this.etatCommande = etatCommande;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public Client getOwner() {
		return owner;
	}

	public void setOwner(Client owner) {
		this.owner = owner;
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
		result = prime * result + ((article == null) ? 0 : article.hashCode());
		result = prime * result + ((dateCommande == null) ? 0 : dateCommande.hashCode());
		result = prime * result + ((etatCommande == null) ? 0 : etatCommande.hashCode());
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		result = prime * result + quantite;
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
		Commande other = (Commande) obj;
		if (article == null) {
			if (other.article != null)
				return false;
		} else if (!article.equals(other.article))
			return false;
		if (dateCommande == null) {
			if (other.dateCommande != null)
				return false;
		} else if (!dateCommande.equals(other.dateCommande))
			return false;
		if (etatCommande == null) {
			if (other.etatCommande != null)
				return false;
		} else if (!etatCommande.equals(other.etatCommande))
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		if (quantite != other.quantite)
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
		return "Commande [article=" + article + ", dateCommande=" + dateCommande + ", etatCommande=" + etatCommande
				+ ", quantite=" + quantite + ", owner=" + owner + ", version=" + version + "]";
	}
	 
}
