package com.example.application.core.usecase.people;

import com.example.application.core.domain.people.People;
import com.example.application.ports.in.people.FindPeopleByIdInputPort;
import com.example.application.ports.out.people.FindPeopleByIdOutputPort;

public class FindPeopleByIdByIdUseCase implements FindPeopleByIdInputPort {

    private final FindPeopleByIdOutputPort findPeopleByIdOutputPort;

    public FindPeopleByIdByIdUseCase(
            FindPeopleByIdOutputPort findPeopleByIdOutputPort
    ) {
        this.findPeopleByIdOutputPort = findPeopleByIdOutputPort;
    }

    @Override
    public People find(Integer peopleId) {
        var planet = findPeopleByIdOutputPort.find(peopleId);
        return planet;
    }

}

