# CHATBOT


This web application was designed for student to be able to ask questions to their teachers anonmyously. 
Student and teachers are able to create an account on the application. Teachers are able to create a class, while student are able to join a class by the given access code when a teacher creates a class. 
Once a course or class is created, students are able to ask questions to a teacher about the course. The teachers then can either answer the question or delete it. A question is only accessible to other students if the teacher answers the questions. Otherwise, the teacher can either delete the question or refrain from answering, which the question that is not answered will delete within a week. Students also have the ability to nudge their question if it has not been answered, which brings the question to the top of the teacher's list of questions.
 
## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.
##### 1)Download the files 
##### 2) Run the application of eclipse 
##### 3) Change the password for your database...
##### 4) Run icognito.controller as a java project
##### 5)Open a web broswer and type in: localhost:8080/

### Prerequisites

What things you need to install the software and how to install them
##### 1)Eclipse Java 2019-09
##### 2)mySQL workbench
##### 3)SQL connector 
##### 4)Spring MVC 
##### 5)


### Installing

See Installation.md for installing the project.

End with an example of getting some data out of the system or using it for a little demo

## Built With

* [Dropwizard](http://www.dropwizard.io/1.0.2/docs/) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [ROME](https://rometools.github.io/rome/) - Used to generate RSS Feeds

## Functionalities 
|FR1.  Student Login|
|---|
|**Goal**: Student user must be able to login to the application to access message boards.
**Stakeholders:** Students|
| **Description:** A student user must be able to login to the application using an email (Wayne State email) and password. When a student opens up the application, it will prompt them to choose ‘teacher’ or ‘student’. If they select student, it will lead them to a login page where they will login using their Wayne State email and a password. Logging in will give them access to a dashboard where they can join classes and navigate the classes they’ve already joined. |

|FR 2: Student Dashboard |
|---|
|**Goal**:  Give student user a view to navigate the application.
**Stakeholders:** Students|
| **Description:** The dashboard view for students will be different than for teachers. It will give students the option to join a class. It will also contain a section that displays the courses a student has already joined. Clicking on a class will lead the student to the message board for that class. |

|FR 3: Join Class|
|---|
|**Goal**: Student users should be able to join a class they are enrolled in.
**Stakeholders:** Students|
| **Description:** From the dashboard, when a student user clicks on the ‘Join Class’ option, they will be led to a page that prompts the student to enter an access code. This access code was given to the student previously by the teacher. Once they enter the access code, the student is now a member of that course and can access the message board from the dashboard. |

|FR 4: Ask Question|
|---|
|**Goal**: Students can ask questions anonymously.
**Stakeholders:** Students|
| **Description:** The main functionality of this application is for students to ask questions anonymously to their teacher. The way this will be performed is that students will have a text-box to ask their question and click a “Send” button that will update their “Previously Asked Questions” page with the latest question. This question will also be sent to the teacher’s dashboard in the designated class page.|

|FR 5: Nudge Question|
|---|
|**Goal**: Students can “nudge” a question to notify the teacher
**Stakeholders:** Students|
| **Description:** The student will be able to go into their “Previously Asked Questions” page and click the “nudge” button on their selected question. This will then inform the teacher to answer or delete the question as appropriate. The student can nudge the question an unlimited amount of times. |

|FR 6: Delete Question (student)|
|---|
|**Goal**: Students can delete a question they have already asked.
**Stakeholders:** Students|
| **Description:** The student will be able to go into their “Previously Asked Questions” page and click the “delete” button to a question they wish to remove. This will remove the question from both their “Previously Asked Questions” page as well as from the assigned class page on the Teacher side. The student can delete the question only before the teacher has answered it. |

|FR 7: Teacher Login|
|---|
|**Goal**: Teachers should be able to login using their wayne state email address.
**Stakeholders:** Teachers|
| **Description:** When a teacher first enters a website application, two buttons show up: “I’m a student” and “I’m a teacher”. The teacher  then selects the “I’m a teacher” button. This link sends them into another page which allows them to sign up or login. If the teacher has already signed up before, then they are able to login. The system verifies that the email and password matches the one found in the database. If they match, the system then sends them to the dashboard page. If the teacher has not signed up, they are to sign up with their wayne state email and create a password, which then sends an email confirmation. |

|FR 8: Teacher Dashboard|
|---|
|**Goal**: Teachers should be able to view their dashboard and be able to perform many functionalities including accessing a class, creating a class, and selecting a class.
**Stakeholders:** Teachers|
| **Description:** Once the teacher logins, a dashboard will appear. Teachers are able to view their classes. They are also able to add a class on this page. Once a teacher selects a class, they are able to access all the questions asked by students in that class. |

|FR 9: Create Classes |
|---|
|**Goal**: Teachers are able to create a class.
**Stakeholders:**Teachers|
| **Description:** Once the teacher logins to the system, the system then sends them to the dashboard where the teacher can create a class by selecting the “Create Class” button. The teacher is then able to name the class and then select “Add class” after. Then a randomly generated access code shows up that teachers are able to provide to the students in their class to add the class. |

|FR 10: Generate Access Code|
|---|
|**Goal**: Teachers are able to generate an access code for every class they create.
**Stakeholders:** Teachers|
| **Description:** Once the teachers create their class, they are presented with a “custom access code” and a “generate random access code” buttons. If they select the first option they are presented with a small text box and a submit button. If they select “generate random access code” the button is replaced with a random access code designated to their course.|

|FR 11: Answer Question|
|---|
|**Goal**: Teachers answer questions that get posted on the main message board
**Stakeholders:** Teachers|
| **Description:** The teacher is presented with a custom message board for each class. The teacher can review each question asked. Once the teacher clicks on a specific question a collapsed text is is revealed with a submit button. The teacher can approve the question and automatically upload it on the main message board once the teacher clicks the “submit” button.|

|FR 12: Delete Question (Teacher)|
|---|
|**Goal**: Teachers can delete questions they don’t find suitable for the message board 
**Stakeholders:** Teachers|
| **Description:** The teacher will have the option of clicking an “X” that is located on the side of each individual question. Once the teacher clicks that “X” the question is from their personal message board and the database |

|FR 13: Select Class|
|---|
|**Goal**: Teacher/student must be able to select a class.
**Stakeholders:** Students and teachers|
| **Description:** Once teacher creates a class, this section in dashboard will allow the teacher to select the class they have created before, this is useful when there are multiple classes for the teacher. As a student, this will allow them to access various classes individual. This will help student to differentiate easily. |

|FR 14: Email Confirmation|
|---|
|**Goal**: Sent Email confirmation when Teacher/Student registers.
**Stakeholders:** Students and teachers|
| **Description:** This function will make sure that the particular user email is authentic. It will also help the Teacher/student to reset the password or update any information. Once a student or teacher registers, a confirmation email will be sent to the email address. The student and teacher must select the link provided to confirm their email address. |

|FR 15: Automated Question Deletion|
|---|
|**Goal**:  Automatic deletion of question on a certain time frame.|
|**Stakeholders:** Students and Teachers
| **Description:** The function allows deletion of a particular question when not addressed by teacher or nudge by student after a time frame. The time frame could be set by the teacher or it is a default period of one week. |

## Authors

* **Akshatha Kumar** - *Initial Work* 
* **Nasr Almansoob** - *Initial Work*
* **Darshit Tailor** - *Initial Work* 
* **Anika Tauifiq** - *Initial Work*
* **Nuha Malik** - *Initial Work* 

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details


