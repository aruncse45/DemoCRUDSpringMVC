package com.demo.controller;

import com.demo.bean.Person;
import com.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class PersonController {

    @Autowired
    PersonService personService;

    @RequestMapping("/view")
    public String view(){
        return "addPerson";
    }

    @RequestMapping("/viewAll")
    public String viewAll(Model m){
        List <Person> persons = personService.viewAll();
        m.addAttribute("persons",persons);
        return "display";
    }

    @RequestMapping(value = "/addPerson", method = RequestMethod.POST)
    public String addPerson(@ModelAttribute("person") Person person){
        personService.addPerson(person);
        return "redirect:/viewAll";
    }

    @RequestMapping(value = "/deletePerson/{pId}", method = RequestMethod.GET)
    public String deletePerson(@PathVariable int pId){
        personService.deletePerson(pId);
        return "redirect:/viewAll";
    }

    @RequestMapping("/editPerson/{pId}")
    public String editPersonForm(@PathVariable int pId, Model m){
        Person person = personService.findPerson(pId);
        m.addAttribute("command", person);
        return "personEditForm";
    }

    @RequestMapping(value = "/editSave", method = RequestMethod.POST)
    public String editSave(@ModelAttribute("person") Person person){
        personService.editPerson(person, person.getpId());
        return "redirect:/viewAll";
    }
}
