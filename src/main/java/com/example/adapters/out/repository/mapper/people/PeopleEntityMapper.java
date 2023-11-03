package com.example.adapters.out.repository.mapper.people;

import com.example.adapters.out.repository.entity.people.PeopleEntity;
import com.example.application.core.domain.people.People;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PeopleEntityMapper {



    PeopleEntity toPeopleEntity(People people);
    People toPeople(PeopleEntity peopleEntity);

}
