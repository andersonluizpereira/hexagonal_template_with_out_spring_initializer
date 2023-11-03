package com.example.application.ports.in.people;

import com.example.application.core.domain.people.People;

public interface FindPeopleByIdInputPort {

    People find(Integer peopleId);

}
