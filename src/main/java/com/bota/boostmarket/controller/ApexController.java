package com.bota.boostmarket.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class ApexController {

    @Value("classpath:data/boosters.json")
    Resource resourceFile;

    @GetMapping(path ="/boosters")
    public ResponseEntity<Object> getDesks() {
        return ResponseEntity.ok().body(resourceFile);
    }
}
