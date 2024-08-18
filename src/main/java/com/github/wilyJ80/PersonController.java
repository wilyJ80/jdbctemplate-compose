package com.github.wilyJ80;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

	@Autowired
	private final PersonService personService;

	public PersonController(PersonService personService) {
		this.personService = personService;

	}

	@GetMapping("/person")
	public ResponseEntity<List<String>> getAllPersons() {
		List<String> persons = personService.getAllPersons();

		return ResponseEntity.ok(persons);
	}

	@PostMapping("/person")
	public ResponseEntity<Void> createPerson(@RequestBody Person person) {
		personService.createPerson(person);

		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
}
