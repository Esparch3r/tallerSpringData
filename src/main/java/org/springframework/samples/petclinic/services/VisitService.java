package org.springframework.samples.petclinic.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Visit;
import org.springframework.samples.petclinic.repository.VisitRepository;
import org.springframework.stereotype.Service;

@Service
public class VisitService {
	@Autowired
	private VisitRepository visitRepository;

	public VisitRepository getVisitRepository() {
		return visitRepository;
	}

	public void setVisitRepository(VisitRepository visitRepository) {
		this.visitRepository = visitRepository;
	}
	
	public List<Visit> obtener3(){
		return this.visitRepository.findTop3ByOrderByDateDesc();
	}

}
