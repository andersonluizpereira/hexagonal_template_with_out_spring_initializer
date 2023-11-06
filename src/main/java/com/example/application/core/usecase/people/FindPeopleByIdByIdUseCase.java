package com.example.application.core.usecase.people;

import com.example.adapters.out.people.FindPeopleByIdAdapter;
import com.example.application.core.domain.people.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindPeopleByIdByIdUseCase {

    @Autowired
    private FindPeopleByIdAdapter FindPeopleByIdCodeClient;
    public People find(Integer peopleId) {
        var planet = FindPeopleByIdCodeClient.find(peopleId);
        return planet;
    }

}

