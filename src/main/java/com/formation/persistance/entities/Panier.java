package com.formation.persistance.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Table (name = "paniers")
@Entity
public class Panier {
	@Id
	private Long id;
	@Column
	private Date debut;
	@Column
	private Date fin;
	@Column
	private Double prix;
	@Column (name = "qte_dispo")
	private Long qte;
	@Column
	private String titre;
	@OneToMany(fetch=FetchType.EAGER)
	@JoinColumn(name="id_panier")
	private Set<Panier_compose> panier_compose;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDebut() {
		return debut;
	}
	public void setDebut(Date debut) {
		this.debut = debut;
	}
	public Date getFin() {
		return fin;
	}
	public void setFin(Date fin) {
		this.fin = fin;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	public Long getQte() {
		return qte;
	}
	public void setQte(Long qte) {
		this.qte = qte;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public Set<Panier_compose> getPanier_compose() {
		return panier_compose;
	}
	public void setPanier_compose(Set<Panier_compose> panier_compose) {
		this.panier_compose = panier_compose;
	}
	@Override
	public String toString() {
		return "Panier [id=" + id + ", debut=" + debut + ", fin=" + fin + ", prix=" + prix + ", qte=" + qte + ", titre="
				+ titre + ", panier_compose=" + panier_compose + "]";
	}
	
	
	
	
	
	
}
