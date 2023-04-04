package com.example.credentialcollection.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CredentialService {


    private RestTemplate restTemplate;

    public CredentialService() {
        this.restTemplate = new RestTemplate();
    }

}
