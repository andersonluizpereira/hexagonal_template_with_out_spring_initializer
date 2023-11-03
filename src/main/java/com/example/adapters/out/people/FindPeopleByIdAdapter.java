package com.example.adapters.out.people;

import com.example.adapters.out.client.planet.FindPeopleByIdCodeClient;
import com.example.adapters.out.client.planet.mapper.PeopleResponseMapper;
import com.example.application.core.domain.people.People;
import com.example.application.ports.out.people.FindPeopleByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindPeopleByIdAdapter implements FindPeopleByIdOutputPort {

    @Autowired
    private FindPeopleByIdCodeClient findPeopleByIdCodeClient;

    @Autowired
    private PeopleResponseMapper peopleEntityMapper;

    @Override
    public People find(Integer peopleId) {
        var peopleResponse = findPeopleByIdCodeClient.find(peopleId);
        return peopleEntityMapper.toPeople(peopleResponse);
    }

}