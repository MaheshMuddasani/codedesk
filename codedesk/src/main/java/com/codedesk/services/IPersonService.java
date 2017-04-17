package com.codedesk.services;

import java.util.List;

import com.codedesk.entities.Person;

public interface IPersonService {
	  List<Person> getAllPersons();
	     Person getPersonById(int pid);
	     boolean addPerson(Person person);
	     void updatePerson(Person person);
	     void deletePerson(int pid);
}
