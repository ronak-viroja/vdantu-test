package com.example.demo.repositories;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;

@org.springframework.stereotype.Repository() public interface EmployeeRepository
  extends
    org.springframework.data.repository.CrudRepository<com.example.demo.beans.Employee, java.lang.Long> {
;
}
