package org.springframework.samples.petclinic.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Owner;
import org.springframework.samples.petclinic.repository.OwnerRepository;
import org.springframework.stereotype.Service;

@Service
public class OwnerService {

	@Autowired
	private OwnerRepository ownerRepository;

	public Owner OwnerServiceFindById(Integer id){
		Owner o = ownerRepository.findById(id);
		return o;
	}
	
	public OwnerRepository getOwnerRepository() {
		return ownerRepository;
	}

	public void setOwnerRepository(OwnerRepository ownerRepository) {
		this.ownerRepository = ownerRepository;
	}
	
	
}
