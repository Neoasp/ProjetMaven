package com.formation.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.formation.exceptions.ClientNotFoundException;
import com.formation.exceptions.UnknownException;
import com.formation.persistance.entities.Client;
import com.formation.persistance.repositories.IClientRepository;

@RestController
// permet de preciser que tout ce qui est disponible le sera à ce chemin là
@RequestMapping(path = "/client")
public class clientController {
	
	@Autowired
	private IClientRepository repo;
	
	
	@RequestMapping(path = "/list",method = RequestMethod.GET)
	public List<Client> findAll(){
		return repo.findAll();
	}
	
	// GetMapping permet de ne pas avoir à préciser la methode entre les parentheses
	// les {} permettent de preciser que identifiant est une variable (sinon aurait été considéré comme du texte entre les ""
	@GetMapping(path = "/{identifiant}")
	public Client findOne(@PathVariable(name = "identifiant") Long id) {
			// optional car la commande risque de renvoyer un null
			Optional<Client> opt = repo.findById(id);
			if(opt.isEmpty()) {
				throw new ClientNotFoundException("le client " + id + " n'a pas été trouvé");
		}
			return opt.get();
	}
	@GetMapping(path="/nom/{nom}")
	public List<Client> findByName(@PathVariable(name = "name") String name) {
		try {
			return repo.findByName(name);
		} catch (Exception e) {
			throw new UnknownException(e.getMessage());
		}
		
	}

	@DeleteMapping(path = "/{identifiant}")
	public Boolean deleteOne(@PathVariable Long id) {
		
		//rappel de la fonction ci-dessus pour verifier l'existence de l'id avant le delete
		Client c = findOne(id);
	
		//try catch permet d'avoir un retour si l'id n'existe pas
		try {
			repo.delete(c);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	//RequestBody permet d'integrer l'objet client dans l'url
	@PostMapping
	public Client save(@RequestBody Client client) {
		return repo.save(client);
	}
	
}
