package com.portifolio.pizzariappk.dto;

import com.portifolio.pizzariappk.entities.Contact;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactResponseDTO {

    private String number;
    private String type; // mudar para enum

    public ContactResponseDTO(Optional<Contact> byId) {
        this.number = byId.get().getNumber();
        this.type = byId.get().getType();
    }
}
