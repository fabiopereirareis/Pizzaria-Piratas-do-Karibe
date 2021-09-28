package com.portifolio.pizzariappk.dto;

import com.portifolio.pizzariappk.entities.Contact;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactDTO {

    private String number;
    private String type; // mudar para enum

    // ============================ olhar a classe model, teve lteração la para funcionar aqui
//    public Contact build(Optional<Contact> byId){
//        Contact contact = new Contact()
//                .setNumber(this.number)
//                .setType(this.type);
//        return contact;
//    }

//    public ContactDTO(Contact contact){
//        this.number = contact.getNumber();
//        this.type = contact.getType();
//    }


    public ContactDTO(Optional<Contact> byId) {
        this.number = byId.get().getNumber();
        this.type = byId.get().getType();
    }
}
