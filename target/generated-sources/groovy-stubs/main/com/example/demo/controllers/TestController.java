package com.example.demo.controllers;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;

@org.springframework.web.bind.annotation.RestController() @org.springframework.web.bind.annotation.RequestMapping(value="/ecart-test") @org.springframework.web.bind.annotation.CrossOrigin(origins="http://localhost:3000") public class TestController
  extends java.lang.Object  implements
    groovy.lang.GroovyObject {
;
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
public  com.example.demo.repositories.InventoryRepository getInventoryRepository() { return (com.example.demo.repositories.InventoryRepository)null;}
public  void setInventoryRepository(com.example.demo.repositories.InventoryRepository value) { }
public  com.example.demo.repositories.AccountRepository getAccountRepository() { return (com.example.demo.repositories.AccountRepository)null;}
public  void setAccountRepository(com.example.demo.repositories.AccountRepository value) { }
public  com.example.demo.repositories.OrderRepository getOrderRepository() { return (com.example.demo.repositories.OrderRepository)null;}
public  void setOrderRepository(com.example.demo.repositories.OrderRepository value) { }
@org.springframework.web.bind.annotation.RequestMapping(method=org.springframework.web.bind.annotation.RequestMethod.GET, value="/get") public  java.lang.Object get() { return null;}
@org.springframework.web.bind.annotation.RequestMapping(method=org.springframework.web.bind.annotation.RequestMethod.POST, value="/order") public synchronized  java.lang.Object order(@org.springframework.web.bind.annotation.RequestBody(required=true) com.example.demo.documents.Order order) { return null;}
}
