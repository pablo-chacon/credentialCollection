package com.example.credentialcollection.model;


import lombok.Data;


@Data
public class CredentialDetails {

    private Credentials[] credentials;
    private String email;
    private String password;

    CredentialDetails(Credentials credentials) {

        this.email = credentials.getEmail();
        this.password = credentials.getPassword();

    }
}
