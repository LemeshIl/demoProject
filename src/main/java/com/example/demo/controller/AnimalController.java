package com.example.demo.controller;

import com.example.demo.model.Owner;
import com.example.demo.model.Pet;
import com.example.demo.model.Request;
import com.example.demo.repository.OwnerRepository;
import com.example.demo.repository.PetRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@AllArgsConstructor
@RestController

@RequestMapping("/animal")
public class AnimalController {
    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;


    @GetMapping("/get/{id}")
    public Owner getOwner(@PathVariable("id") String id) {
        Long param = Long.valueOf(id);
        Owner owner = new Owner();
        Optional<Owner> ownerOpt = ownerRepository.findById(param);
        if (ownerOpt.isPresent()) {
            owner = ownerOpt.get();
        }

        System.out.println(owner);

        return owner;
    }

    @GetMapping("/getpet/{id}")
    public Pet getPet(@PathVariable("id") String id) {
        Long param = Long.valueOf(id);
        Pet pet = new Pet();
        Optional<Pet> petOpt = petRepository.findById(param);
        if (petOpt.isPresent()) {
            pet = petOpt.get();
        }
        System.out.println(pet);

        return pet;
    }

    @PostMapping("/save")
    public Pet create(@RequestBody Request request) {
//        Owner owner = new Owner();
//        owner.setName(request.getOwner().getName());
//        Pet pet = new Pet();
//        Pet petReq = request.getOwner().getPets().get(0);
//        pet.setName(petReq.getName());
//        pet.setOwner(owner);
//
//        owner.setPets(List.of(pet));

  //      Pet pet = request.getPet();

    //    Pet pet =    petRepository.save(request.getPet());


       // ownerRepository.save(owner);
        return petRepository.save(request.getPet());

    }

}
