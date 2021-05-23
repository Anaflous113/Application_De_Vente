package org.site.eboutique.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

public class Commande   implements Serializable {
	private Long idCommande ;
	private Date dateCommande;
	private Collection<LigneCommande> itmes;
	private Client client;
	public Long getIdCommande() {
		return idCommande;
	}
	public void setIdCommande(Long idCommande) {
		this.idCommande = idCommande;
	}
	public Date getDateCommande() {
		return dateCommande;
	}
	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}
	public Collection<LigneCommande> getItmes() {
		return itmes;
	}
	public void setItmes(Collection<LigneCommande> itmes) {
		this.itmes = itmes;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Commande() {
		super();
	}
	
	

}
