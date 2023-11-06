package com.example.adapters.in.controller;

import com.example.adapters.in.controller.mapper.PeopleMapper;
import com.example.adapters.in.controller.response.PeopleResponse;
import com.example.application.core.usecase.people.FindPeopleByIdByIdUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/peoples")
public class PeopleController {
    @Autowired
    private FindPeopleByIdByIdUseCase findPeopleByIdByIdUseCase;

    @Autowired
    private PeopleMapper peopleMapper;

    @GetMapping("/{id}")
    public ResponseEntity<PeopleResponse> findById(@PathVariable final Integer id) {
        var customer = findPeopleByIdByIdUseCase.find(id);
        var customerResponse = peopleMapper.toPeopleResponse(customer);
        return ResponseEntity.ok().body(customerResponse);
    }

}
