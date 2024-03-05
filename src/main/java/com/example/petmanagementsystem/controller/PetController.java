package com.example.petmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.petmanagementsystem.model.Pet;
import com.example.petmanagementsystem.service.PetService;

@RestController
//@RequestMapping("/pets")
public class PetController {
	@Autowired
	private PetService petService;

	@GetMapping("/home")
	public String home() {
		return "Welcome to PetManagement System";
	}

	@GetMapping("/allpets")
	public List<Pet> getAllPets() {
		return petService.getAllPets();
	}

	@PostMapping("/add")
	public Pet createPet(@RequestBody Pet pet) {
		return petService.saveOrUpdatePet(pet);
	}

	@PutMapping("/update/{id}")
	public Pet updatePet(@PathVariable Long id, @RequestBody Pet pet) {
		pet.setId(id);
		return petService.saveOrUpdatePet(pet);
	}

	@DeleteMapping("/delete/{id}")
	public void deletePet(@PathVariable Long id) {
		petService.deletePet(id);
	}

}
