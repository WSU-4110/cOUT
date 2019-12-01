package com.cout.incognito.models;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuestionTest {
	//Question question = new Question(1,"Hello?", true);
	
	@Test
	public void testGetID() {
		int id = 3;
		Question question = new Question(3,"Hello?", false);
		assertEquals(id,question.getID());
	}

	@Test
	public void testSetID() {
		int id = 1;
		Question question = new Question();
		question.setID(id);
		assertEquals(id,question.getID());
	}

	@Test
	public void testGetQUESTION() {
		String ques = "Hello?";
		Question question = new Question(1,ques,true);
		assertEquals(ques,question.getQUESTION());
	}

	@Test
	public void testSetQUESTION() {
		String str = "Is this a question?";
		Question question = new Question();
		question.setQUESTION(str);
		assertEquals(str, question.getQUESTION());
	}

	@Test
	public void testIsIs_answered() {
		Question question = new Question(1, "Hello?", false);
		assertEquals(false,question.isIs_answered());
	}

	@Test
	public void testToString() {
		Question question = new Question(1,"Hello?",true);
		String questionToString = question.toString();
		
		assertEquals(true,questionToString.contains("Hello"));
	}

}
