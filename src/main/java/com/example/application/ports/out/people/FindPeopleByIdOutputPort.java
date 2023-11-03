package com.example.application.ports.out.people;

import com.example.application.core.domain.people.People;

public interface FindPeopleByIdOutputPort {

    People find(Integer id);

}
