
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
	
    CONSTRAINT fk_detalle_profesor 
    FOREIGN KEY (detalle_profesor_id) 
    REFERENCES detalle_profesor (id) 
    ON DELETE NO ACTION 
    ON UPDATE NO ACTION
);

CREATE TABLE curso (
	id INT NOT NULL AUTO_INCREMENT,
	titulo VARCHAR(100) DEFAULT NULL,
	descripcion VARCHAR(200) DEFAULT NULL,
    profesor_id INT DEFAULT NULL,
	PRIMARY KEY (id),
	
	CONSTRAINT fk_profesor 
	FOREIGN KEY (profesor_id) 
	REFERENCES profesor (id)   
	ON DELETE NO ACTION 
    ON UPDATE NO ACTION
);

CREATE TABLE revision_curso (
	id INT NOT NULL AUTO_INCREMENT,
	comentario VARCHAR(200) DEFAULT NULL,
	curso_id INT DEFAULT NULL,
	PRIMARY KEY (id),
	
	CONSTRAINT fk_curso 
	FOREIGN KEY (curso_id) 
	REFERENCES curso (id)   
	ON DELETE NO ACTION 
    ON UPDATE NO ACTION
);

INSERT INTO detalle_profesor (id, canal_youtube, pasatiempo) VALUES 
	('1','https://www.youtube.com/armando-main','Leer y escribir'),
	('2','https://www.youtube.com/tutoriales-gratis','Disfrutar tiempo con sus hijos'),
	('3','https://www.youtube.com/la-cocina-de-juan','cocinar');

INSERT INTO profesor (id, nombre, apellido, email, detalle_profesor_id) VALUES 
	('1','Armando','Marin','armando.mar235@j3c.dev','1'),
	('2','Pedro','Cardona','pedro.cardo1@j3c.dev','2'),
	('3','Juan','Grisales','juan-grisales333@j3c.dev','3');
    
INSERT INTO curso (id,titulo,descripcion,profesor_id) VALUES
	('1','Spring & Hibernate','En este curso aprenderas todos los conceptos de Spring y Hibernate','1'),
	('2','The MEAN Stack','En este curso aprenderas todos los conceptos de Mongo DB, Express, Angular y Node JS','1'),
	('3','The MEAN Stack','En este curso aprenderas todos los conceptos de Mongo DB, Express, Angular y Node JS','2');
INSERT INTO revision_curso (id,comentario,curso_id) VALUES 
	('1','El curso estuvo genial, me ayudo mucho a entender muchos conceptos','3'),
	('2','El curso esta muy bien elaborado, contiene mucho contenido util','2'),
	('3','El curso es horrible, el profesor no explica bien los conceptos','3'),
	('4','Simplemente genial, muy bien explicado todo','2'),
	('5','El curso es bueno pero no cumple mis expectativas','3');
