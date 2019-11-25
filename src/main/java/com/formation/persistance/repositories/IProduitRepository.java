package com.formation.persistance.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formation.persistance.entities.Produit;

public interface IProduitRepository extends JpaRepository<Produit, Long> {

}
