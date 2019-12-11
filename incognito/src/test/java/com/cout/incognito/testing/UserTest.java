//Nasr
package com.cout.incognito.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cout.incognito.models.User;

class testUser {
	
	User globalUser = new User();

	@Test
	void testGetID() {
		int ID = 1;
		User user = new User();
		user.setID(ID);
		assertEquals(ID, user.getID());
	}

	@Test
	void testSetID() {
		globalUser.setID(3);
		assertEquals(3,globalUser.getID());
	}

	@Test
	void testGetNAME() {
		String name = "Nasr Almansoob";
		User user = new User();
		user.setNAME(name);
		assertEquals(name, user.getNAME());
	}

	@Test
	void testSetNAME() {
		globalUser.setNAME("Nasr Almansoob");
		assertEquals("Nasr Almansoob",globalUser.getNAME());
	}

	@Test
	void testGetEMAIL() {
		String email = "fi3193@wayne.edu";
		User user = new User();
		user.setEMAIL(email);
		assertEquals(email, user.getEMAIL());
	}

	@Test
	void testSetEMAIL() {
		globalUser.setEMAIL("fi3193@wayne.edu");
		assertEquals("fi3193@wayne.edu",globalUser.getEMAIL());
	}

	@Test
	void testGetPassword() {
		String password = "1234";
		User user = new User();
		user.setPassword(password);
		assertEquals(password, user.getPassword());
	}

	@Test
	void testSetPassword() {
		globalUser.setPassword("1234");
		assertEquals("1234",globalUser.getPassword());
	}

	@Test
	void testIsEnabled() {
		boolean enabled = true;
		User user = new User();
		user.setEnabled(enabled);
		assertEquals(enabled, user.isEnabled());
	}

	@Test
	void testSetEnabled() {
		globalUser.setEnabled(true);
		assertEquals(true,globalUser.isEnabled());
	}

	@Test
	void testGetRole() {
		String role = "student";
		User user = new User();
		user.setRole(role);
		assertEquals(role, user.getRole());
	}

	@Test
	void testSetRole() {
		globalUser.setRole("teacher");
		assertEquals("teacher",globalUser.getRole());
	}

}