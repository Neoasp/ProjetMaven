package com.formation.persistance.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table (name = "produits")
@Entity
public class Produit {
	
	@Id
	private Long id;
	@Column
	private String libelle;
	@Column
	private String description;
	@ManyToOne
	@JoinColumn(name = "id_produit", referencedColumnName = "id")
	private Categorie categorie;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Produit [id=" + id + ", libelle=" + libelle + ", description=" + description + "]";
	}

	
}
