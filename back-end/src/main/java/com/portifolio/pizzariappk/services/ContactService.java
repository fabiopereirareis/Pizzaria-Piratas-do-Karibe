package com.portifolio.pizzariappk.services;

import com.portifolio.pizzariappk.entities.Contact;
import com.portifolio.pizzariappk.mapper.ContactMapper;
import com.portifolio.pizzariappk.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class ContactService {

    @Autowired
    ContactRepository contactRepository;

    @Autowired
    ContactMapper contactMapper;

    public Optional<Contact> findById(Long id){
        return contactRepository.findById(id);
    }
}
