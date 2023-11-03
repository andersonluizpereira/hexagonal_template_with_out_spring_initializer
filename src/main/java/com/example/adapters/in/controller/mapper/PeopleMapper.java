package com.example.adapters.in.controller.mapper;


import com.example.adapters.in.controller.response.PeopleResponse;
import com.example.application.core.domain.people.People;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PeopleMapper {
    PeopleResponse toPeopleResponse(People people);
}
