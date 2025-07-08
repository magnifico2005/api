package com.consumer.api.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ExternalAPIsService {

     @Autowired
    private RestTemplate restTemplate ;


    public String getAllDatas(){
        String url ="https://restcountries.com/v3.1/all?fields=name,capital,region,flags";

      ResponseEntity<String> forEntity = restTemplate.getForEntity(url, String.class);

        return forEntity.getBody();

    }

}
