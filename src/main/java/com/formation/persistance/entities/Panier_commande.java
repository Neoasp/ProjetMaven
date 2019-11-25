package com.formation.persistance.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table (name = "paniers_to_commandes")
@Entity
public class Panier_commande {
	
	@Id
	private Long id;
	
	@Column
	private Long qte;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn (name="id_panier_commande", referencedColumnName="id")
	private Panier panier;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getQte() {
		return qte;
	}

	public void setQte(Long qte) {
		this.qte = qte;
	}
	
	public Panier getPanier() {
		return panier;
	}

	public void setPanier(Panier panier) {
		this.panier = panier;
	}

	@Override
	public String toString() {
		return "Panier_commande [id=" + id + ", qte=" + qte + ", panier=" + panier + "]";
	}

	
	
	

}
