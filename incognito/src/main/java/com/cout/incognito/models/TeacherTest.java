package com.cout.incognito.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TeacherTest {

	@Test
	void testSetNAME() {
		String str = "John Smith";
		Teacher teacher1 = new Teacher();
		teacher1.setNAME(str);
		assertEquals(str, teacher1.getNAME());
		
		//fail("Not yet implemented");
	}

	@Test
	void testGetNAME() {
		String teacherName = "Nuha Malik";
		Teacher teacher1 = new Teacher(1, teacherName, "nuha.malik@wayne.edu","rand",false,"teacher");
	
		assertEquals(teacherName, teacher1.getNAME());
		//fail("Not yet implemented");
	}

	@Test
	void testSetEMAIL() {
		String email = "john.smith@wayne.edu";
		Teacher teacher1 = new Teacher();
		teacher1.setEMAIL(email);
		assertEquals(email, teacher1.getEMAIL());
		//fail("Not yet implemented");
	}

	@Test
	void testGetEMAIL() {
		String teacherEmail = "nuha.malik@wayne.edu";
		Teacher teacher1 = new Teacher(1, "Nuha Malik", "nuha.malik@wayne.edu","rand",false,"teacher");
		
		assertEquals(teacherEmail, teacher1.getEMAIL());
		//fail("Not yet implemented");
	}

	@Test
	void testGetPassword() {
		fail("Not yet implemented");
	}

	@Test
	void testSetPassword() {
		fail("Not yet implemented");
	}

	@Test
	void testGetID() {
		fail("Not yet implemented");
	}

	@Test
	void testSetID() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		Teacher teacher1 = new Teacher(1, "Nuha Malik", "nuha.malik@wayne.edu","rand",false,"teacher");
		String teacher1ToString = teacher1.toString();
		
		assertEquals(true, teacher1ToString.contains("john.smith@wayne.edu"));
		
		//fail("Not yet implemented");
	}

	@Test
	void testIsEnabled() {
		Teacher teacher1 = new Teacher(1, "Nuha Malik", "nuha.malik@wayne.edu","rand",false,"teacher");

		assertEquals(true, teacher1.isEnabled());
		//fail("Not yet implemented");
	}

	@Test
	void testSetEnabled() {
		fail("Not yet implemented");
	}

}
