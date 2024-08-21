CREATE DATABASE db;
USE db;

CREATE TABLE person (
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
	name TEXT NOT NULL,
	age INTEGER NOT NULL
);

INSERT INTO person (
	name, age
	) VALUES ('Victor', 22), ('Hugo', 11), ('Joao', 24), ('Daniel', 15), ('Maria', 32), ('Alysson', 36), ('Lucas', 8), ('Rafael', 62), ('Debora', 18), ('Leandro', 81), ('Gerusa', 4), ('Janaina', 60), ('Marta', 28);
