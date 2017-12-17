package com.qual.prix.solutions.webstock.domaine;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
 


 
@Entity(name="QLPRIXSLPROD")
public class QlPrixSlProduits implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7625534589432119667L;
	
	@Id
	@SequenceGenerator(name = "QUALPRIXSOL_PRODUITS_SEQ", sequenceName = "qual_produits_id_seq")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "QUALPRIXSOL_PRODUITS_SEQ")
	@Column(name = "ID_QLPSPROD", nullable = false)
	private Long id_QlPSPROD; 
	
	@Column(name = "PROD_NAME", nullable = false, updatable = true, insertable = true, unique = false)
	private String prodName;
	
	@Column(name = "QUANTITE", nullable = false, updatable = true, insertable = true, unique = false)
	private Integer quantite;
	
	@Column(name = "PRIX_UNITAIRE", nullable = false, updatable = true, insertable = true, unique = false)
	private Double prix_unitaire;
	
	@Column(name = "TYPE_PROD", nullable = false, updatable = true, insertable = true, unique = false)
	private String type_prod;

	
	public QlPrixSlProduits() {
		super();
	}


	public QlPrixSlProduits(Long id_QlPSPROD, String prodName, Integer quantite, Double prix_unitaire,
			String type_prod) {
		super();
		this.id_QlPSPROD = id_QlPSPROD;
		this.prodName = prodName;
		this.quantite = quantite;
		this.prix_unitaire = prix_unitaire;
		this.type_prod = type_prod;
	}


	public Long getId_QlPSPROD() {
		return id_QlPSPROD;
	}


	public void setId_QlPSPROD(Long id_QlPSPROD) {
		this.id_QlPSPROD = id_QlPSPROD;
	}


	public String getProdName() {
		return prodName;
	}


	public void setProdName(String prodName) {
		this.prodName = prodName;
	}


	public Integer getQuantite() {
		return quantite;
	}


	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}


	public Double getPrix_unitaire() {
		return prix_unitaire;
	}


	public void setPrix_unitaire(Double prix_unitaire) {
		this.prix_unitaire = prix_unitaire;
	}


	public String getType_prod() {
		return type_prod;
	}


	public void setType_prod(String type_prod) {
		this.type_prod = type_prod;
	}
	

}
