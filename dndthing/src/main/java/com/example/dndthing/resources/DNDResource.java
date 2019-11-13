package com.example.dndthing.resources;

import com.example.dndthing.models.EndpointURL;
import com.example.dndthing.models.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/category")
public class DNDResource {

    @Autowired
    public RestTemplate restTemplate;

    @RequestMapping("/{category}")
    public EndpointURL getAllCategories(@PathVariable("category") String category) {

        EndpointURL endpoint= restTemplate.getForObject("http://dnd5eapi.co/api/" + category, EndpointURL.class);
        return endpoint;
    }
}
