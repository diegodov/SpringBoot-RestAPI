package com.diegodov.apirest.Service;

import com.diegodov.apirest.Repository.PersonRepository;
import com.diegodov.apirest.Entity.Person;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    //save
    public void savePerson (Person person) {
        personRepository.save(person);
    }

    //delete by id
    public void deletePersonById (Long id) {
        personRepository.deleteById(id);
    }

    //show by id
    public Optional<Person> showPersonById (Long id) {
        return personRepository.findById(id);
    }

    //show all
    public List<Person> showAllPerson () {
        return personRepository.findAll();
    }

    //delete all
    public void deleteAllPerson () {
        personRepository.deleteAll();
    }


}
