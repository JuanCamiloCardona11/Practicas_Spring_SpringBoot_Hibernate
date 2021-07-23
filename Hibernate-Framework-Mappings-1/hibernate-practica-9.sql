
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
