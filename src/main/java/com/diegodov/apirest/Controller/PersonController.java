package com.diegodov.apirest.Controller;

import com.diegodov.apirest.Entity.Person;
import com.diegodov.apirest.Service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Person")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/showall")
    @ResponseBody
    public List<Person> showAll () {
        return personService.showAllPerson();
    }

    @PostMapping("/save")
    public void save (@RequestBody Person person) {
        personService.savePerson(person);
    }

    @PostMapping("/deleteall")
    public void deleteAll () {
        personService.deleteAllPerson();
    }

    @PostMapping("/delete/{id}")
    public void deleteById (@PathVariable Long id) {
        personService.deletePersonById(id);
    }

    @GetMapping("/show/{id}")
    public Optional<Person> showById (@PathVariable Long id) {
       return personService.showPersonById(id);
    }






}
