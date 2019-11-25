package com.formation.persistance.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formation.persistance.entities.Panier;

public interface IPanierRepository extends JpaRepository<Panier, Long>{

}
