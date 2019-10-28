CREATE DATABASE cOUT;

USE cOUT; 

CREATE TABLE Teachers (
	NAME VARCHAR(25),
    EMAIL VARCHAR(30),
    COURSES integer,
    emailConfirmation boolean DEFAULT false,
    password VARCHAR(15),
    PRIMARY KEY (EMAIL),
    FOREIGN KEY (COURSES) references courses(AccessCode)
);
DROP TABLE Teachers;

ALTER TABLE Teachers ADD PRIMARY KEY(EMAIL);

DELETE from Teachers;
ALTER TABLE Teachers
MODIFY COLUMN COURSES integer;

CREATE TABLE Students (
    NAME VARCHAR(25),
    EMAIL VARCHAR(30),
    COURSES integer,
    emailConfirmation boolean DEFAULT false,
    password VARCHAR(15),
    PRIMARY KEY(EMAIL),
    FOREIGN KEY (COURSES) references courses(AccessCode)
);

INSERT INTO Students 
VALUES ('Nuha Malik', 'n.and.m.26@gmail.com', 123458, 0 ,'randomm');
INSERT INTO Students 
VALUES ('Mario Bodier', 'mario@gmail.com', 123458, 0,'randomm');

CREATE TABLE courses (
	CrsId VARCHAR(8),
    CrsName VARCHAR(25),
    Professor VARCHAR(25),
    AccessCode integer,
    PRIMARY KEY(AccessCode)
);
INSERT INTO Courses
VALUES('CSC 4710', 'Database', 'Corey Tessler', 123458);

SELECT * FROM Students;

ALTER TABLE Students ADD UNIQUE(EMAIL);

ALTER TABLE Teachers ADD UNIQUE(EMAIL);

INSERT INTO Students 
VALUES ('7', 'Anika Taufiq', 'fv6961@wayne.edu', 123458, 0 ,'random');

INSERT INTO Students 
VALUES ('5', 'Anika Taufiq', 'fv6961@wayne.edu', 123458, 0 ,'random');

SELECT * FROM students;

/*SELECT * FROM students, Teachers WHERE userid = students.EMAIL OR userid = Teachers.EMAIL; */

