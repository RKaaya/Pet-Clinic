package rkaaya.springframework.petclinic.services;

import org.springframework.data.repository.CrudRepository;
import rkaaya.springframework.petclinic.model.Owner;

public interface OwnerService extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);
}
