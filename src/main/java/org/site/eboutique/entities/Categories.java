package org.site.eboutique.entities;

import java.io.Serializable;
import java.util.Collection;

public class Categories implements Serializable {
	private Long idcategorie;
	private String nomCategorie;
	private String  description;
	private byte[] photo;
	private String nomPhoto;
	private Collection<Produit> prouduit;
	public Long getIdcategorie() {
		return idcategorie;
	}
	public void setIdcategorie(Long idcategorie) {
		this.idcategorie = idcategorie;
	}
	public String getNomCategorie() {
		return nomCategorie;
	}
	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	public String getNomPhoto() {
		return nomPhoto;
	}
	public void setNomPhoto(String nomPhoto) {
		this.nomPhoto = nomPhoto;
	}
	public Collection<Produit> getProuduit() {
		return prouduit;
	}
	public void setProuduit(Collection<Produit> prouduit) {
		this.prouduit = prouduit;
	}
	public Categories(String nomCategorie, String description, byte[] photo, String nomPhoto) {
		super();
		this.nomCategorie = nomCategorie;
		this.description = description;
		this.photo = photo;
		this.nomPhoto = nomPhoto;
	}
	public Categories() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
