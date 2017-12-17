package com.qual.prix.solutions.webstock.domaine;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
 
 

@Entity(name="ARTICLES")
public class Article implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 
	 @Id
	 @SequenceGenerator(name="QUALPRIXSOL_ARTICLE_SEQ", sequenceName="qual_article_id_seq")
	 @GeneratedValue(strategy = GenerationType.AUTO ,generator="QUALPRIXSOL_ARTICLE_SEQ")
	 @Column(name = "ARTICLEID", nullable = false)
	 private Long articleId;
	
	 @Column(name = "ARTICLENAME", nullable = false, updatable = true, insertable = true, unique = false)
	 private String articleName;
	
	 @Column(name = "CATEGORY", nullable = false, updatable = true, insertable = true, unique = false)
	 private String categery;
	
	 @Column(name = "PROVIDER", nullable = false, updatable = true, insertable = true, unique = false)
	 private String provider;
	
	 @Column(name = "DESCRIPTION", nullable = false, updatable = true, insertable = true, unique = false)
	 private String description;
	
	 @Column(name = "POIDS", nullable = false, updatable = true, insertable = true, unique = false)
	 private double poids;
	 
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name="INVENTAIREID")
	 private Inventaire inventaire;

	public Article(Long articleId, String articleName, String categery, String provider, String description,
			double poids, Inventaire inventaire) {
		super();
		this.articleId = articleId;
		this.articleName = articleName;
		this.categery = categery;
		this.provider = provider;
		this.description = description;
		this.poids = poids;
		this.inventaire = inventaire;
	}

	public Article() {
		super();
	}

	public Long getArticleId() {
		return articleId;
	}

	public void setArticleId(Long articleId) {
		this.articleId = articleId;
	}

	public String getArticleName() {
		return articleName;
	}

	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	public String getCategery() {
		return categery;
	}

	public void setCategery(String categery) {
		this.categery = categery;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

	public Inventaire getInventaire() {
		return inventaire;
	}

	public void setInventaire(Inventaire inventaire) {
		this.inventaire = inventaire;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((articleId == null) ? 0 : articleId.hashCode());
		result = prime * result + ((articleName == null) ? 0 : articleName.hashCode());
		result = prime * result + ((categery == null) ? 0 : categery.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((inventaire == null) ? 0 : inventaire.hashCode());
		long temp;
		temp = Double.doubleToLongBits(poids);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((provider == null) ? 0 : provider.hashCode());
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
		Article other = (Article) obj;
		if (articleId == null) {
			if (other.articleId != null)
				return false;
		} else if (!articleId.equals(other.articleId))
			return false;
		if (articleName == null) {
			if (other.articleName != null)
				return false;
		} else if (!articleName.equals(other.articleName))
			return false;
		if (categery == null) {
			if (other.categery != null)
				return false;
		} else if (!categery.equals(other.categery))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (inventaire == null) {
			if (other.inventaire != null)
				return false;
		} else if (!inventaire.equals(other.inventaire))
			return false;
		if (Double.doubleToLongBits(poids) != Double.doubleToLongBits(other.poids))
			return false;
		if (provider == null) {
			if (other.provider != null)
				return false;
		} else if (!provider.equals(other.provider))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Article [articleId=" + articleId + ", articleName=" + articleName + ", categery=" + categery
				+ ", provider=" + provider + ", description=" + description + ", poids=" + poids + ", inventaire="
				+ inventaire + "]";
	}

	 
}
