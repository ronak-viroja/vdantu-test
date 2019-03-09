package com.example.demo.repositories;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;

@org.springframework.stereotype.Repository() public interface OrderRepository
  extends
    org.springframework.data.mongodb.repository.MongoRepository<com.example.demo.documents.Order, java.lang.String> {
;
}
