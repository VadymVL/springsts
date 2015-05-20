package com.spring.tutorial.dao;

import java.util.List;

import com.spring.tutorial.model.Person;
 
public interface PersonDAO {
 
    public void save(Person p);
     
    public List<Person> list();
     
}
