package com.github.wilyJ80;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

	@Autowired
	private final JdbcTemplate jdbcTemplate;

	public PersonService(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<String> getAllPersons() {
		String sql = "SELECT name FROM person";

		return jdbcTemplate.queryForList(sql, String.class);
	}

	public void createPerson(Person person) {
		String sql = "INSERT INTO person (name) VALUES (?)";

		jdbcTemplate.update(sql, person.getName());
	}

}
