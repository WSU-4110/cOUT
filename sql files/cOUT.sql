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

/*INSERT INTO Teachers(NAME, EMAIL, COURSES, emailConfirmation, password)
VALUES('John Smith', 'john.smith@wayne.edu', 'CSC 4110, CSC 4710' , 'CONFIRMED', '12fg678');*/

/*delete FROM Teachers where teacherId = 1;*/
DROP TABLE Teachers;

SELECT * FROM Teachers;

