package com.example.demo.documents

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Inventory {

    @Id
    private String id
    private String name
    private int price
    private int quantity
    private String unity

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    int getPrice() {
        return price
    }

    void setPrice(int price) {
        this.price = price
    }

    int getQuantity() {
        return quantity
    }

    void setQuantity(int quantity) {
        this.quantity = quantity
    }

    String getUnity() {
        return unity
    }

    void setUnity(String unity) {
        this.unity = unity
    }
}