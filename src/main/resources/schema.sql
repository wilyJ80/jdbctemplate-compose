CREATE DATABASE db;
USE db;

CREATE TABLE person (
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
	name TEXT NOT NULL
);

INSERT INTO person (
	name
	) VALUES ('Victor'), ('Hugo'), ('Joao'), ('Daniel'), ('Maria'), ('Alysson'), ('Lucas'), ('Rafael'), ('Debora'), ('Leandro'), ('Gerusa'), ('Janaina'), ('Marta');
