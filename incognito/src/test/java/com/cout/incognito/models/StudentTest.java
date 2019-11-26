package com.cout.incognito.models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentTest {

	//1
	
		@Test
		void testSetNAME() {
			String str = "John Smith";
			Student student1 = new Student();
			student1.setNAME(str);
			assertEquals(str, student1.getNAME());

			//fail("Not yet implemented");
		}


		
		//2
		
		@Test
		void testGetNAME() {
			String studentName = "Akshatha Kumar";
			Student student1 = new Student(1, studentName, "ft8759@wayne.edu","rand",false,"student");

			assertEquals(studentName, student1.getNAME());
			//fail("Not yet implemented");
		}
		
		//3
		@Test
		void testSetEMAIL() {
			String email = "john.smith@wayne.edu";
			Student student1 = new Student();
			student1.setEMAIL(email);
			assertEquals(email, student1.getEMAIL());
			//fail("Not yet implemented");
		}
		
		//4
		@Test
		void testGetEMAIL() {
			String studentEmail = "ft8759@wayne.edu";
			Student student1 = new Student(1, "Akshatha", "ft8759@wayne.edu","rand",false,"student");

			assertEquals(studentEmail, student1.getEMAIL());
			//fail("Not yet implemented");
		}
		

		//5
		@Test
		void testToString() {
			Student student1 = new Student(1, "Akshatha", "ft8759@wayne.edu","rand",false,"student");
			String student1ToString = student1.toString();

			assertEquals(true, student1ToString.contains("@wayne.edu"));

			//fail("Not yet implemented");
		}
		
		//6
		
		@Test
		void testIsEnabled() {
			Student student1 = new Student(1, "Akshatha Kumar", "ft8759@wayne.edu","rand",false,"student");

			assertEquals(false, student1.isEnabled());
			//fail("Not yet implemented");
		}

	

}
