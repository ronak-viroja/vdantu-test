package com.example.demo.controllers;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;

@org.springframework.web.bind.annotation.RestController() @org.springframework.web.bind.annotation.RequestMapping(value="/ronak-demo") @org.springframework.web.bind.annotation.CrossOrigin(origins="http://localhost:3000") public class DemoController
  extends java.lang.Object  implements
    groovy.lang.GroovyObject {
;
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
public  com.example.demo.services.EmployeeService getEmployeeService() { return (com.example.demo.services.EmployeeService)null;}
public  void setEmployeeService(com.example.demo.services.EmployeeService value) { }
@org.springframework.web.bind.annotation.RequestMapping(method=org.springframework.web.bind.annotation.RequestMethod.GET, value="/get") public  java.lang.Object get() { return null;}
@org.springframework.web.bind.annotation.RequestMapping(method=org.springframework.web.bind.annotation.RequestMethod.POST, value="/save") public  java.lang.Object save(@org.springframework.web.bind.annotation.RequestBody(required=true) com.example.demo.beans.Employee employee) { return null;}
@org.springframework.web.bind.annotation.RequestMapping(method=org.springframework.web.bind.annotation.RequestMethod.DELETE, value="/delete") public  java.lang.Object delete(@org.springframework.web.bind.annotation.RequestParam(value="id", required=true) java.lang.Long id) { return null;}
}
