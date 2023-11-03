package com.example.config.people;

import com.example.adapters.out.people.FindPeopleByIdAdapter;
import com.example.application.core.usecase.people.FindPeopleByIdByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindPeopleByIdConfig {

    @Bean
    public FindPeopleByIdByIdUseCase insertPeopleUseCase(
            FindPeopleByIdAdapter findPeopleByIdCodeAdapter
    ) {
        return new FindPeopleByIdByIdUseCase(findPeopleByIdCodeAdapter);
    }

}
