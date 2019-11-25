package com.formation.persistance.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formation.persistance.entities.Commande;

public interface ICommandeRepository extends JpaRepository <Commande, Long> {

	
	
}
