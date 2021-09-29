package com.portifolio.pizzariappk.services;

import com.portifolio.pizzariappk.dto.ContactResponseDTO;
import com.portifolio.pizzariappk.dto.request.ContactRequestDTO;
import com.portifolio.pizzariappk.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    @Autowired
    ContactRepository contactRepository;

    public ContactResponseDTO findById(Long id){
        return new ContactResponseDTO(contactRepository.findById(id));
    }

    public ContactRequestDTO addContact(ContactRequestDTO contactRequestDTO){
//        contactRequestDTO.build(contactRequestDTO);
        contactRepository.save(contactRequestDTO.build());
        return contactRequestDTO;
    }
}
