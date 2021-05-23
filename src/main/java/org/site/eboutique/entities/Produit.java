package org.site.eboutique.entities;

import java.io.Serializable;

public class Produit  implements Serializable {
	
	private Long idProduit;
	private String desognation;
	private String description ;
	private double prix ;
	private boolean selected;
	private String photo ;
	private int quantite;
	private Categories categorie;
	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Produit(String desognation, String description, double prix, boolean selected, String photo, int quantite) {
		super();
		this.desognation = desognation;
		this.description = description;
		this.prix = prix;
		this.selected = selected;
		this.photo = photo;
		this.quantite = quantite;
	}
	public Long getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}
	public String getDesognation() {
		return desognation;
	}
	public void setDesognation(String desognation) {
		this.desognation = desognation;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public Categories getCategorie() {
		return categorie;
	}
	public void setCategorie(Categories categorie) {
		this.categorie = categorie;
	}
	

}
