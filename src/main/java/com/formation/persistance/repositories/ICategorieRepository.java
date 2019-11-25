package com.formation.persistance.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formation.persistance.entities.Categorie;

public interface ICategorieRepository extends JpaRepository<Categorie, Long>{

}
