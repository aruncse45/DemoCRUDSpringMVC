package com.demo.dao;

import com.demo.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Qualifier("personDao")
public class PersonDaoImpl implements PersonDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void addPerson(Person person) {
        jdbcTemplate.update("Insert into person (p_id, first_name, Last_name, age) values (?,?,?,?) ", person.getpId(), person.getFirstName(), person.getLastName(), person.getAge());
        System.out.println("Person Added");
    }

    @Override
    public void editPerson(Person person, int personId) {
        jdbcTemplate.update("update person set first_name = ?, last_name = ?, age = ? where p_id = ?", person.getFirstName(), person.getLastName(), person.getAge(), personId);
        System.out.println("Person Updated");
    }

    @Override
    public void deletePerson(int personId) {
        jdbcTemplate.update("delete from person where p_id = ?", personId);
        System.out.println("Person Deleted");
    }

    @Override
    public Person findPerson(int personId) {
        return jdbcTemplate.queryForObject("select * from person where p_id = ? ", new Object[] {personId}, new BeanPropertyRowMapper<>(Person.class));
    }

    @Override
    public List <Person> viewAll() {
        List <Person> persons = jdbcTemplate.query("select * from person", new BeanPropertyRowMapper<>(Person.class));
        return persons;
    }
}
