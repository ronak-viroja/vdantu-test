package com.example.demo.repositories

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.documents.Inventory

@Repository
public interface InventoryRepository extends MongoRepository<Inventory, String> {

    Inventory findByName(String name)
}