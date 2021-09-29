package com.portifolio.pizzariappk.controllers;

import com.portifolio.pizzariappk.dto.ContactResponseDTO;
import com.portifolio.pizzariappk.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;



    @GetMapping("/{id}")
    public ContactResponseDTO findById(@PathVariable Long id){
        return contactService.findById(id);
    }
}
