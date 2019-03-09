package com.example.demo.services;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;

public interface EmployeeService
 {
;
 java.util.List findAll();
 com.example.demo.beans.Employee save(com.example.demo.beans.Employee employee);
 com.example.demo.beans.Employee findOne(java.lang.Long id);
 void delete(java.lang.Long id);
}
