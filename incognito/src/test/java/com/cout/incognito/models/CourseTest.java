package com.cout.incognito.models;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CourseTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	
	@Test
	void testSetCrsId() {
		int CrsId = 101;
		Course course1 = new Course();
		course1.setCrsId(CrsId);
		assertEquals(101, course1.getCrsId());
		//fail("Not yet implemented");
	}

	@Test
	void testGetCrsId() {
		int CrsId = 101;
		Course course1 = new Course();
		course1.setCrsId(CrsId);
		assertEquals(101, course1.getCrsId());

		//fail("Not yet implemented");
	}

	@Test
	void testSetCrsName() {
		String CrsName = "Csc 3222";
		Course course1 = new Course();
		course1.setCrsName(CrsName);
		assertEquals("Csc 3222", course1.getCrsName());
		//fail("Not yet implemented");
	}

	@Test
	void testGetCrsName() {
		String CrsName = "Csc 3222";
		Course course1 = new Course();
		course1.setCrsName(CrsName);
		assertEquals("Csc 3222", course1.getCrsName());
//		fail("Not yet implemented");
	}

	@Test
	void testGetAccessCode() {
		int CrsId = 10214;
		Course course1 = new Course();
		course1.setAccessCode(CrsId);
		assertEquals(10214, course1.getAccessCode());
//		fail("Not yet implemented");
	}
	@Test
	void testSetAccessCode() {
		int CrsId = 10214;
		Course course1 = new Course();
		course1.setAccessCode(CrsId);
		assertEquals(10214, course1.getAccessCode());
//		fail("Not yet implemented");
	}
}
