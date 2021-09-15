package com.portifolio.pizzariappk.controllers;

import com.portifolio.pizzariappk.entities.Contact;
import com.portifolio.pizzariappk.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
@RequestMapping("/api")
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @GetMapping("/{id}")
    public Optional<Contact> findById(@PathVariable Long id){
        return contactRepository.findById(id);
    }
}
