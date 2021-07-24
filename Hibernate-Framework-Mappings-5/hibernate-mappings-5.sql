
CREATE DATABASE escuela_bd;
USE escuela_bd;

CREATE TABLE detalle_profesor (
	id int NOT NULL AUTO_INCREMENT,
    canal_youtube VARCHAR(150) DEFAULT NULL,
    pasatiempo VARCHAR(100) DEFAULT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE profesor (
	id INT NOT NULL AUTO_INCREMENT,
	nombre VARCHAR(45) DEFAULT NULL,
	apellido VARCHAR(45) DEFAULT NULL,
	email VARCHAR(100) DEFAULT NULL,
	detalle_profesor_id INT DEFAULT NULL,
	PRIMARY KEY (id),
    KEY fk_detalle_profesor (detalle_profesor_id),
	CONSTRAINT fk_detalle_profesor FOREIGN KEY (detalle_profesor_id) REFERENCES detalle_profesor (id)
);

INSERT INTO detalle_profesor (id, canal_youtube, pasatiempo) VALUES 
	('1','https://www.youtube.com/armando-main','Leer y escribir'),
	('2','https://www.youtube.com/tutoriales-gratis','Disfrutar tiempo con sus hijos'),
	('3','https://www.youtube.com/la-cocina-de-juan','cocinar');

INSERT INTO profesor (id, nombre, apellido, email, detalle_profesor_id) VALUES 
	('1','Armando','Marin','armando.mar235@j3c.dev','1'),
	('2','Pedro','Cardona','pedro.cardo1@j3c.dev','2'),
	('3','Juan','Grisales','juan-grisales333@j3c.dev','3');
