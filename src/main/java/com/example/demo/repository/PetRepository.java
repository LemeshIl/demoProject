package com.example.demo.repository;

import com.example.demo.model.Owner;
import com.example.demo.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository  extends CrudRepository<Pet, Long> {
}
