package com.timeout.gambit.sfgpetclinic.services;

import com.timeout.gambit.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
