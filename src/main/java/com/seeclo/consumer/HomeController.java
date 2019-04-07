package com.seeclo.consumer;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class HomeController {

    @GetMapping(value = "/home-consumer")
    public ResponseEntity homeConsumer(){
        return new ResponseEntity("Hello consumer", HttpStatus.OK);
    }

    @GetMapping(value = "/producer-consumer")
    public String helloToProducer(){
        return "Hello producer this cosumer asking you...";
    }
}
