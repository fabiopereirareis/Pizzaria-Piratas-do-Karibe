package com.portifolio.pizzariappk.entities;

import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
@Entity(name = "contato")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "numero")
    private String number;
    @Column(name = "tipo")
    private String type; // mudar para enum
}


//}@Entity(name = "tb_contact")
//public class Contact {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id_contact;
//    private String number;
//    private String type; // mudar para enum

