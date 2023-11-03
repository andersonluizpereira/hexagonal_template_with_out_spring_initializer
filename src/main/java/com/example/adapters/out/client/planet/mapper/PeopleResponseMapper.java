package com.example.adapters.out.client.planet.mapper;

import com.example.adapters.out.client.planet.response.PeopleResponse;
import com.example.application.core.domain.people.People;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PeopleResponseMapper {

    People toPeople(PeopleResponse peopleResponse);

}
