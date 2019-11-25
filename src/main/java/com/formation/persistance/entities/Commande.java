package com.formation.persistance.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;





@Table(name = "commandes")
@Entity
public class Commande {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private Date date;
	@Column (name = "montant_ht")
	private double montant;

	@OneToMany(fetch=FetchType.EAGER)
	@JoinColumn(name="id_cmd")
	private Set<Panier_commande> panier_commande;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public Set<Panier_commande> getPanier_commande() {
		return panier_commande;
	}
	public void setPanier_commande(Set<Panier_commande> panier_commande) {
		this.panier_commande = panier_commande;
	}
	@Override
	public String toString() {
		return "Commande [id=" + id + ", date=" + date + ", montant=" + montant + ", panier_commande=" + panier_commande
				+ "]";
	}
	
	
	
	
	
	
	
	

}
