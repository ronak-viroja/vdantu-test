package com.example.demo.repositories;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;

@org.springframework.stereotype.Repository() public interface InventoryRepository
  extends
    org.springframework.data.mongodb.repository.MongoRepository<com.example.demo.documents.Inventory, java.lang.String> {
;
 com.example.demo.documents.Inventory findByName(java.lang.String name);
}
