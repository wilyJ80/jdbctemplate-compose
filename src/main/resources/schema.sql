CREATE DATABASE person;
USE person;

CREATE TABLE person (
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
	name TEXT NOT NULL
);

INSERT INTO person (
	name
	) VALUES ('Artorias the Abysswalker'), ('Yuria of Londor'), ('Yoel of Londor'), ('Dragonslayer Armor'), ('King Vendrick'), ('Darklurker'), ('Nashandra'), ('Navlaan'), ('Lonesome Gavlan');
