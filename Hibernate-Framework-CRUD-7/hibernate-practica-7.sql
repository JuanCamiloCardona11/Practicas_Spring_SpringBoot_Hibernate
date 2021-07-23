CREATE DATABASE escuela_bd;
USE escuela_bd;

CREATE TABLE estudiantes(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(50) NOT NULL,
	apellido VARCHAR(50) NOT NULL,	
    email VARCHAR(100) NOT NULL
);

INSERT INTO estudiantes (nombre, apellido,email) VALUES 
	('Juan','Cardona','juan.cardonq@j3c.dev'),
	('Luis','Marin','luis-marin@j3c.dev'),
	('Cristian','Osorio','cristian-osorio@j3c.dev'),
	('Andrea','Bedoya','andrea-bedoya2@j3c.dev'),
	('Juan','Piedrahita','juan-piedrahita165@j3c.dev'),
	('Luis','Marin','luis-marin@j3c.dev'),
	('Cristian','Osorio','cristian-osorio@j3c.dev'),
	('Andrea','Bedoya','andrea-bedoya2@j3c.dev'),
	('Valentina','Arango','valentina22@j3c.dev'),
	('Valeria','Bedoya','vale.bedoya66@j3c.dev');
    
    