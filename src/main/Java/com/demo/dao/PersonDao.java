package com.demo.dao;

import com.demo.bean.Person;

import java.util.List;

public interface PersonDao {

    void addPerson(Person person);
    void editPerson(Person person, int personId);
    void deletePerson(int personId);
    Person findPerson(int personId);
    public List <Person> viewAll();
}
