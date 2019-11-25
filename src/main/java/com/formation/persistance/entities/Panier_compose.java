package com.formation.persistance.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "paniers_to_produits")
@Entity
public class Panier_compose {
	
	@Id
	private Long id;
	@ManyToOne
	@JoinColumn(name = "id_panier_compose", referencedColumnName = "id")
	private Produit produit;
	

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

	@Override
	public String toString() {
		return "Panier_compose [id=" + id + ", produit=" + produit + "]";
	}

	
	

}
