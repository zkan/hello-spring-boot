package team.bears.swagger.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import team.bears.swagger.models.Person;

@RestController
public class PersonController {

    @RequestMapping(value = "/persons/{id}", method = RequestMethod.GET)
    public Person getPersonById(@PathVariable Long id) {
        Person p = new Person();
        p.setId(id);
        p.setFirstName("Kan");

        return p;
    }

}
