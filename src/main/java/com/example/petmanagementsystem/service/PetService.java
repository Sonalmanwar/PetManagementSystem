package com.example.petmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.petmanagementsystem.Repository.PetRepository;
import com.example.petmanagementsystem.model.Pet;
import org.springframework.stereotype.Service;

public class PetService {
	 @Autowired
	    private PetRepository petRepository;

	    public List<Pet> getAllPets() {
	        return petRepository.findAll();
	    }

	    public Pet saveOrUpdatePet(Pet pet) {
	        return petRepository.save(pet);
	    }

	    public void deletePet(Long id) {
	        petRepository.deleteById(id);
	    }
}
