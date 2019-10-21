CREATE DATABASE cOUT;

USE cOUT; 

CREATE TABLE Teachers (
	teacherId INTEGER NOT NULL auto_increment,
	NAME VARCHAR(25),
    EMAIL VARCHAR(30),
    COURSES VARCHAR(45),
    emailConfirmation boolean,
    password VARCHAR(15),
    PRIMARY KEY (teacherId)
);

INSERT INTO Teachers(NAME, EMAIL, COURSES, emailConfirmation, password)
VALUES('John Smith', 'john.smith@wayne.edu', 'CSC 4110, CSC 4710' , true, '12fg678');

SELECT * FROM Teachers;

USE cOUT;

CREATE TABLE students (
	studentID INTEGER NOT NULL auto_increment,
    NAME VARCHAR(25),
    EMAIL VARCHAR(30),
    COURSES VARCHAR(45),
    emailConfirmation boolean,
    password VARCHAR(15),
    PRIMARY KEY(studentID)
);
ALTER TABLE Teachers 
MODIFY COLUMN emailConfirmation boolean DEFAULT false;

ALTER TABLE students
MODIFY COLUMN 
INSERT INTO students(NAME, EMAIL, COURSES, emailConfirmation, password)
values('Jane Doe', 'jane.doe@wayne.edu', 'CSC4111', true, 'pass1234');
SELECT * FROM students;
    
SHOW Tables;