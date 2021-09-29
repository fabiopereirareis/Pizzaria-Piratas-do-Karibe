package com.portifolio.pizzariappk.dto.request;

import com.portifolio.pizzariappk.entities.Contact;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactRequestDTO {

    private String number;
    private String type; // mudar para enum

    // ============================ olhar a classe model, teve lteração la para funcionar aqui
    public Contact build(){
        Contact contact = new Contact()
                .setNumber(this.number)
                .setType(this.type);
        return contact;
    }



}
