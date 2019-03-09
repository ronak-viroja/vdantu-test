package com.example.demo.repositories

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.documents.Account

@Repository
public interface AccountRepository extends MongoRepository<Account, String> {

    Account findByName(String name)

    Account findByPassword(String password)

}