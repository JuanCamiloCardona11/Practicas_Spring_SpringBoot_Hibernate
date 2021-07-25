
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

CREATE TABLE estudiante (
	id INT NOT NULL AUTO_INCREMENT,
	nombre VARCHAR(50) DEFAULT NULL,
	apellido VARCHAR(50) DEFAULT NULL,
	email VARCHAR(100) DEFAULT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE curso_estudiante (
	
    curso_id INT NOT NULL,
    estudiante_id INT NOT NULL,
    
    PRIMARY KEY (curso_id, estudiante_id),
    
	CONSTRAINT fk_curso_2
	FOREIGN KEY (curso_id) 
	REFERENCES curso (id)   
	ON DELETE NO ACTION 
    ON UPDATE NO ACTION,
    
	CONSTRAINT fk_estudiante_2
	FOREIGN KEY (estudiante_id) 
	REFERENCES estudiante (id)   
	ON DELETE NO ACTION 
    ON UPDATE NO ACTION
);
