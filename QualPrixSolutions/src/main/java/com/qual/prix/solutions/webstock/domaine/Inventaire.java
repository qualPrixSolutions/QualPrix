package com.qual.prix.solutions.webstock.domaine;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
 

 


@Entity(name="INVENTAIRES")
public class Inventaire implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 
	 @Id
	 @SequenceGenerator(name="QUALPRIXSOL_INVENTAIRE_SEQ", sequenceName="qual_inventaire_id_seq")
	 @GeneratedValue(strategy = GenerationType.AUTO ,generator="QUALPRIXSOL_INVENTAIRE_SEQ")
	 @Column(name = "inventaireId", nullable = false)
	 private Long inventaireId;
	
	 @Column(name = "QUANTITE", nullable = false, updatable = true, insertable = true, unique = false)
	 private int quantite;
	
	 @Column(name = "PRIX", nullable = false, updatable = true, insertable = true, unique = false)
	 private double prix;
	
	 @Column(name = "RAYON", nullable = false, updatable = true, insertable = true, unique = false)
	 private String rayon;
	
	 @Column(name = "REGION", nullable = false, updatable = true, insertable = true, unique = false)
	 private String region;
	
	 @Column(name = "VERSION", nullable = false, updatable = true, insertable = true, unique = false)
	 private String version;
	
	 @OneToMany(orphanRemoval=true,fetch=FetchType.LAZY,mappedBy="inventaire")
	 private List<Article> listArticles;

	public Inventaire() {
		super();
	}

	public Inventaire(int quantite, double prix, String rayon, String region, String version,
			List<Article> listArticles) {
		super();
		this.quantite = quantite;
		this.prix = prix;
		this.rayon = rayon;
		this.region = region;
		this.version = version;
		this.listArticles = listArticles;
	}

	public Long getInventaireId() {
		return inventaireId;
	}

	public void setInventaireId(Long inventaireId) {
		this.inventaireId = inventaireId;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getRayon() {
		return rayon;
	}

	public void setRayon(String rayon) {
		this.rayon = rayon;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public List<Article> getListArticles() {
		return listArticles;
	}

	public void setListArticles(List<Article> listArticles) {
		this.listArticles = listArticles;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((listArticles == null) ? 0 : listArticles.hashCode());
		long temp;
		temp = Double.doubleToLongBits(prix);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + quantite;
		result = prime * result + ((rayon == null) ? 0 : rayon.hashCode());
		result = prime * result + ((region == null) ? 0 : region.hashCode());
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
		Inventaire other = (Inventaire) obj;
		if (listArticles == null) {
			if (other.listArticles != null)
				return false;
		} else if (!listArticles.equals(other.listArticles))
			return false;
		if (Double.doubleToLongBits(prix) != Double.doubleToLongBits(other.prix))
			return false;
		if (quantite != other.quantite)
			return false;
		if (rayon == null) {
			if (other.rayon != null)
				return false;
		} else if (!rayon.equals(other.rayon))
			return false;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
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
		return "Inventaire [quantite=" + quantite + ", prix=" + prix + ", rayon=" + rayon + ", region=" + region
				+ ", version=" + version + ", listArticles=" + listArticles + "]";
	} 
	 
}
