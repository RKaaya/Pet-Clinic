package rkaaya.springframework.petclinic.services;

import rkaaya.springframework.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
