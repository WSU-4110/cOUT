//Darshit Tailor(gr9446)
package com.cout.incognito.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cout.incognito.models.Courses;

class CoursesTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	
	@Test
	void testSetCrsId() {
		int CrsId = 101;
		Courses Courses1 = new Courses();
		Courses1.setCrsId(CrsId);
		assertEquals(101, Courses1.getCrsId());
		//fail("Not yet implemented");
	}

	@Test
	void testGetCrsId() {
		int CrsId = 101;
		Courses Courses1 = new Courses();
		Courses1.setCrsId(CrsId);
		assertEquals(101, Courses1.getCrsId());

		//fail("Not yet implemented");
	}

	@Test
	void testSetCrsName() {
		String CrsName = "Csc 3222";
		Courses Courses1 = new Courses();
		Courses1.setCrsName(CrsName);
		assertEquals("Csc 3222", Courses1.getCrsName());
		//fail("Not yet implemented");
	}

	@Test
	void testGetCrsName() {
		String CrsName = "Csc 3222";
		Courses Courses1 = new Courses();
		Courses1.setCrsName(CrsName);
		assertEquals("Csc 3222", Courses1.getCrsName());
//		fail("Not yet implemented");
	}

	@Test
	void testGetAccessCode() {
		int CrsId = 10214;
		Courses Courses1 = new Courses();
		Courses1.setAccessCode(CrsId);
		assertEquals(10214, Courses1.getAccessCode());
//		fail("Not yet implemented");
	}
	@Test
	void testSetAccessCode() {
		int CrsId = 10214;
		Courses Courses1 = new Courses();
		Courses1.setAccessCode(CrsId);
		assertEquals(10214, Courses1.getAccessCode());
//		fail("Not yet implemented");
	}
}
