package com.qual.prix.solutions.webstock.domaine;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
 


@Entity(name="SHOPOBJETS")
public class ShopObjets implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8849170009272646612L;
	
	@Id
	@SequenceGenerator(name = "QUALPRIXSOL_SHOPOBJETS_SEQ", sequenceName = "qual_shopobjets_id_seq")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "QUALPRIXSOL_SHOPOBJETS_SEQ")
	@Column(name = "ID_SHOP", nullable = false)
	private Long id_Shop; 
	
	@Column(name = "REPERTOIRE", nullable = false, updatable = true, insertable = true, unique = false)
	private String repertoire;
	
	@Column(name = "IMG_NAME", nullable = false, updatable = true, insertable = true, unique = true)
	private String imgName;
	
	@Column(name = "IMG_EXTENSION", nullable = false, updatable = true, insertable = true, unique = false)
	private String extensionImg;
	
	@Column(name = "TYPE_PRODUIT", nullable = false, updatable = true, insertable = true, unique = false)
	private String typeProduit;
	
	@Column(name = "LABEL_OBJET", nullable = false, updatable = true, insertable = true, unique = false)
	private String labelObjet;

	public ShopObjets(Long id_Shop, String repertoire, String imgName, String extensionImg, String typeProduit,
			String labelObjet) {
		super();
		this.id_Shop = id_Shop;
		this.repertoire = repertoire;
		this.imgName = imgName;
		this.extensionImg = extensionImg;
		this.typeProduit = typeProduit;
		this.labelObjet = labelObjet;
	}

	public ShopObjets() {
		super();
	}

	public Long getId_Shop() {
		return id_Shop;
	}

	public void setId_Shop(Long id_Shop) {
		this.id_Shop = id_Shop;
	}

	public String getRepertoire() {
		return repertoire;
	}

	public void setRepertoire(String repertoire) {
		this.repertoire = repertoire;
	}

	public String getImgName() {
		return imgName;
	}

	public void setImgName(String imgName) {
		this.imgName = imgName;
	}

	public String getExtensionImg() {
		return extensionImg;
	}

	public void setExtensionImg(String extensionImg) {
		this.extensionImg = extensionImg;
	}

	public String getTypeProduit() {
		return typeProduit;
	}

	public void setTypeProduit(String typeProduit) {
		this.typeProduit = typeProduit;
	}

	public String getLabelObjet() {
		return labelObjet;
	}

	public void setLabelObjet(String labelObjet) {
		this.labelObjet = labelObjet;
	}

}
