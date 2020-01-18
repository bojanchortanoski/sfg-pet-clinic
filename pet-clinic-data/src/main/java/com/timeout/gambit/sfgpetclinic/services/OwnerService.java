package com.timeout.gambit.sfgpetclinic.services;

import com.timeout.gambit.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
