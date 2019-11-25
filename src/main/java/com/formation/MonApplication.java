package com.formation;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.formation.persistance.entities.Client;
import com.formation.persistance.repositories.ICategorieRepository;
import com.formation.persistance.repositories.IClientRepository;
import com.formation.persistance.repositories.ICommandeRepository;
import com.formation.persistance.repositories.IPanierRepository;
import com.formation.persistance.repositories.IProduitRepository;


@SpringBootApplication
public class MonApplication implements CommandLineRunner{
	
	@Autowired
	private IClientRepository clientRepo;
	
	@Autowired
	private ICommandeRepository commandeRepo;
	
	@Autowired
	private IPanierRepository panierRepo;
	
	@Autowired
	private IProduitRepository produitRepo;
	
	@Autowired
	private ICategorieRepository categorieRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(MonApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		
		clientRepo.findAll().parallelStream()
		
		.forEach(c -> System.out.println(c.getNom() + " - " + c.getCommandes()));
		
	}
	
	

}