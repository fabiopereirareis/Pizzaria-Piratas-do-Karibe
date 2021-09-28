package com.portifolio.pizzariappk.mapper;

import com.portifolio.pizzariappk.dto.ContactDTO;
import com.portifolio.pizzariappk.entities.Contact;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ContactMapper {

    ContactMapper INSTANCE = Mappers.getMapper(ContactMapper.class);
    
    ContactDTO contactToContactDTO(Contact contact);
}
