package com.example.adapters.out.client.planet;

import com.example.adapters.out.client.planet.response.PeopleResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "FindPeopleByIdCodeClient",
        url = "${pereira.client.address.url}"
)
public interface FindPeopleByIdCodeClient {

    @GetMapping("/people/{id}")
    PeopleResponse find(@PathVariable("id") Integer id);

}
