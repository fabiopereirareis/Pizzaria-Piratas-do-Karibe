package com.portifolio.pizzariappk.services;

import com.portifolio.pizzariappk.dto.ContactDTO;
import com.portifolio.pizzariappk.entities.Contact;
import com.portifolio.pizzariappk.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ContactService {

    @Autowired
    ContactRepository contactRepository;

    public ContactDTO findById(Long id){
        ContactDTO contactDTO = new ContactDTO();
        Optional<Contact> contact = contactRepository.findById(id);
        contactDTO.build(contact);
        return contactDTO ;
    }
}
