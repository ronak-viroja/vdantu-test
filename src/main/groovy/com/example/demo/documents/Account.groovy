package com.example.demo.documents

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Account {

    @Id
    private String id
    private String name
    private String password

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    String getPassword() {
        return password
    }

    void setPassword(String password) {
        this.password = password
    }
}