package com.consumer.api.controller;


import com.consumer.api.service.ExternalAPIsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ExternalAPIsController {



    @Autowired
    private ExternalAPIsService externalAPIsService;

    @GetMapping
    public ResponseEntity<String> getAllDatas(){



        String allDatas = externalAPIsService.getAllDatas();
        return ResponseEntity.ok(allDatas);
    }


}
