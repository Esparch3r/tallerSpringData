package org.springframework.samples.petclinic.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Pet;
import org.springframework.samples.petclinic.repository.PetRepository;
import org.springframework.stereotype.Service;

@Service
public class PetService {
	
	@Autowired
	private PetRepository petRepository;

	public PetRepository getPetRepository() {
		return petRepository;
	}

	public void setPetRepository(PetRepository petRepository) {
		this.petRepository = petRepository;
	}
	
	public List<Pet> nacidas2010(){
		return petRepository.findByBirthDateBetweenOrderByBirthDateAsc(new Date(1995,01,01), new Date(2010,12,31));
	}
	
}
