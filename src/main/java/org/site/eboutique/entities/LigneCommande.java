package org.site.eboutique.entities;

import java.io.Serializable;

public class LigneCommande   implements Serializable {
	 private Long id;
	 private Produit produit;
	 private int quantite;
	 private double prix;
	 private Commande commande;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
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
	public Commande getCommande() {
		return commande;
	}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	public LigneCommande( int quantite, double prix) {
		super();
		this.quantite = quantite;
		this.prix = prix;
	}
	public LigneCommande() {
		super();
		// TODO Auto-generated constructor stub
	}
	 

}
