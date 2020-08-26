package miketek.springframework.sfgpetclinic.services;

import miketek.springframework.sfgpetclinic.model.PetType;

import java.util.Set;

public interface PetTypeService {
    PetType findByLastName(String lastName);
    PetType findById(Long id);
    PetType save(PetType petType);
    Set<PetType> findAll();
}
