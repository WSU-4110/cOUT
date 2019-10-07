USE cOUT;

CREATE TABLE students (
	studentID INTEGER NOT NULL auto_increment,
    NAME VARCHAR(25),
    EMAIL VARCHAR(30),
    COURSES VARCHAR(45),
    emailConfirmation boolean,
    password VARCHAR(15),
    PRIMARY KEY(studentID),
    CHECK(emailConfirmation IN (true, false))
);

INSERT INTO students(NAME, EMAIL, COURSES, emailConfirmation, password)
values('John Smith', 'john.smith@wayne.edu', 'CSC4111', true, 'pass1234');
SELECT * FROM students;
    
SHOW Tables;