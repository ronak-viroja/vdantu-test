package com.example.demo.documents

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
class Order {

    @Id
    private String id
    private String accountName
    private List<Map> items


    Order(){}

    Order(String name, List items) {
        this.accountName = name
        this.items = items
    }

    String getAccountName() {
        return accountName
    }

    void setAccountName(String accountName) {
        this.accountName = accountName
    }

    List<Map> getItems() {
        return items
    }

    void setItems(List<Map> items) {
        this.items = items
    }
}