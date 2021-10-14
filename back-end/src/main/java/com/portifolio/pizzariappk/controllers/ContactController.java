package com.portifolio.pizzariappk.controllers;

import com.portifolio.pizzariappk.dto.response.ContactResponseDTO;
import com.portifolio.pizzariappk.dto.request.ContactRequestDTO;
import com.portifolio.pizzariappk.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "*") // liberando qualquer domínio, sem restrição
@RequestMapping("/api/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;


    // método para pesquisar por id
    @GetMapping("/{id}")
    public ContactResponseDTO findById(@PathVariable Long id){
        return contactService.findById(id);
    }

    // método para adicionar novo contato
    @PostMapping
    public ContactRequestDTO addContact(@RequestBody ContactRequestDTO contactRequestDTO){
        return contactService.addContact(contactRequestDTO);
    }

    // método para listar todos contatos
    @GetMapping("/list")
    public List<ContactResponseDTO> findAll(){
        return contactService.listAllcontacts();
    }

    @PutMapping("/update/{id}")
    // método para atualizar contato
    public ContactRequestDTO upDateContact(@RequestBody ContactRequestDTO contactRequestDTO, @PathVariable Long id){
        return contactService.upDateContact(contactRequestDTO, id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteContact(@PathVariable Long id){
        contactService.deleteContact(id);
    }
}
