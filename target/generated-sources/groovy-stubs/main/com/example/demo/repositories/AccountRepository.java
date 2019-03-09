package com.example.demo.repositories;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;

@org.springframework.stereotype.Repository() public interface AccountRepository
  extends
    org.springframework.data.mongodb.repository.MongoRepository<com.example.demo.documents.Account, java.lang.String> {
;
 com.example.demo.documents.Account findByName(java.lang.String name);
 com.example.demo.documents.Account findByPassword(java.lang.String password);
}
