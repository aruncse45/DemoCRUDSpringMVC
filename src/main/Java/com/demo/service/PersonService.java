package com.demo.service;

import com.demo.bean.Person;

import java.util.List;

public interface PersonService {

    void addPerson(Person person);
    void editPerson(Person person, int personId);
    void deletePerson(int personId);
    Person findPerson(int personId);

    List <Person> viewAll();
}
