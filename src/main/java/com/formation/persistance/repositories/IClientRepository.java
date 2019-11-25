package com.formation.persistance.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.formation.persistance.entities.Client;


public interface IClientRepository extends JpaRepository<Client, Long> {
	
	// ?1 est le premier parametre trouvé dans l'instruction en dessous.
	@Query(nativeQuery = true, value = "SELECT * FROM clients WHERE name LIKE ?1%")
	public List<Client> findByName(String name);
	
	@Query(nativeQuery = true, value = "SELECT * FROM clients WHERE email LIKE ?1")
	public Client findByEmail(String email);
	
}
