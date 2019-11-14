package com.demo.service;

import com.demo.bean.Person;
import com.demo.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("personService")
public class PersonServiceImpl implements PersonService {


    @Autowired
    PersonDao personDao;

    @Override
    public void addPerson(Person person) {
        personDao.addPerson(person);
    }

    @Override
    public void editPerson(Person person, int personId) {
        personDao.editPerson(person, personId);
    }

    @Override
    public void deletePerson(int personId) {
        personDao.deletePerson(personId);
    }

    @Override
    public Person findPerson(int personId) {
        return personDao.findPerson(personId);
    }

    @Override
    public List<Person> viewAll() {
        return personDao.viewAll();
    }
}
