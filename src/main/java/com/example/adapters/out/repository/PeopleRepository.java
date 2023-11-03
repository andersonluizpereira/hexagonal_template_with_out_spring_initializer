package com.example.adapters.out.repository;

import com.example.adapters.out.repository.entity.people.PeopleEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PeopleRepository extends MongoRepository<PeopleEntity, String> {
}
