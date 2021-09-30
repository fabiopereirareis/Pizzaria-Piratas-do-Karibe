package com.portifolio.pizzariappk.services;

import com.portifolio.pizzariappk.dto.ContactResponseDTO;
import com.portifolio.pizzariappk.dto.request.ContactRequestDTO;
import com.portifolio.pizzariappk.entities.Contact;
import com.portifolio.pizzariappk.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class ContactService {

    @Autowired
    ContactRepository contactRepository;

    // método para puxar um contato pelo id
    public ContactResponseDTO findById(Long id){
        return new ContactResponseDTO(contactRepository.findById(id));
    }

    // método para adicionar um novo contato
    public ContactRequestDTO addContact(ContactRequestDTO contactRequestDTO){
        contactRepository.save(contactRequestDTO.build());
        return contactRequestDTO;
    }

    // método para listar todos os dados do tipo contact
    public List<ContactResponseDTO> listAllcontacts(){
        List<Contact> listAll = contactRepository.findAll();
        return listAll.stream().map(x -> new ContactResponseDTO(Optional.ofNullable(x)))
        .collect(Collectors.toList());
    }
}
