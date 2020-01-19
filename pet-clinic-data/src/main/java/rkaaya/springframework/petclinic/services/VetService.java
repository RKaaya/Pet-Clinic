package rkaaya.springframework.petclinic.services;

import org.springframework.data.repository.CrudRepository;
import rkaaya.springframework.petclinic.model.Vet;

public interface VetService extends CrudRepository<Vet, Long> {
}
