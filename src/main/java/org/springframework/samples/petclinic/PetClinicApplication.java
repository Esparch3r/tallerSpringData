/*
 * Copyright 2002-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.samples.petclinic;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.samples.petclinic.model.Owner;
import org.springframework.samples.petclinic.model.Pet;
import org.springframework.samples.petclinic.model.Vet;
import org.springframework.samples.petclinic.model.Visit;
import org.springframework.samples.petclinic.services.OwnerService;
import org.springframework.samples.petclinic.services.PetService;
import org.springframework.samples.petclinic.services.VisitService;

/**
 * PetClinic Spring Boot Application.
 * 
 * @author Dave Syer
 *
 */
@SpringBootApplication
public class PetClinicApplication {
	
	private static final Logger log = LoggerFactory.getLogger(PetClinicApplication.class);

    public static void main(String[] args) throws Exception {
        SpringApplication.run(PetClinicApplication.class, args);
    }
    
    @Bean
	public CommandLineRunner demoVetRepository(PetService petService, OwnerService ownerService, VisitService visitService) {
    	
    	
		return (args) -> {
			log.info("*****************************************************");
			log.info("BOOTCAMP - Spring y Spring Data - vetRepository");
			log.info("*****************************************************");
			
			//TODO Añade aquí tu código
//			String n = "Alfie";
//			String a = "Person";
//			Vet v = new Vet();
//			Vet vId = new Vet();
//			v.setFirstName(n);
//			v.setLastName(a);
//			
//			v = vetRepository.save(v);
//			
//			log.info("ID -> "+v.getId());
//			
//			vId = vetRepository.findOne(v.getId());
//
//			log.info(vId.toString());
//			for(Vet v : vetRepository.searchSpecialty("Radiology")){
//				log.info(v.getFirstName());
//			}
			
//			System.out.println(ownerService.OwnerServiceFindById(1));
			
			for(Pet p : petService.nacidas2010()){
				log.info(p.getName());
			}
			
			for(Visit v : visitService.obtener3()){
				log.info(""+v.getDate());
			}
			
			
		};
	}
    
}
