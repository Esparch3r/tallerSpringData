package org.springframework.samples.petclinic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.repository.VetRepository;
import org.springframework.stereotype.Service;

@Service
public class VetService {
	@Autowired
	private VetRepository vetRepository;

	public VetRepository getVetRepository() {
		return vetRepository;
	}

	public void setVetRepository(VetRepository vetRepository) {
		this.vetRepository = vetRepository;
	}
}
