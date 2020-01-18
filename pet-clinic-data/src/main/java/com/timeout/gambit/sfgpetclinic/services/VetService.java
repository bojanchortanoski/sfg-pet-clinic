package com.timeout.gambit.sfgpetclinic.services;

import com.timeout.gambit.sfgpetclinic.model.Vet;

public interface VetService extends CrudService<Vet, Long> {
    Vet findByLastName(String lastName);
}
