package com.github.wilyJ80;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

	@Autowired
	private final JdbcTemplate jdbcTemplate;

	public PersonService(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Person> getAllPersons() {
		try {
			String sql = "SELECT name, age FROM person";
			return jdbcTemplate.query(sql,
					(rs, rowNum) -> new Person(rs.getString("name"), rs.getInt("age")));
		} catch (DataAccessException getAllException) {
			System.err.println("Error fetching persons: " + getAllException.getMessage());
			return Collections.emptyList();
		}
	}

	public void createPerson(Person person) {
		try {
			String sql = "INSERT INTO person (name, age) VALUES (?, ?)";
			jdbcTemplate.update(sql, person.getName(), person.getAge());
		} catch (DataAccessException createException) {
			System.err.println("Error creating person: " + createException.getMessage());
		}
	}
}
