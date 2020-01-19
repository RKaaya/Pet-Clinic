package rkaaya.springframework.petclinic.services;

import org.springframework.data.repository.CrudRepository;
import rkaaya.springframework.petclinic.model.Pet;

public interface PetService extends CrudRepository<Pet, Long> {
}
