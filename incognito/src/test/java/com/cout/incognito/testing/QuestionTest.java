package com.cout.incognito.testing;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

import com.cout.incognito.models.Question;
import com.cout.incognito.models.User;
public class QuestionTest {
	//Question question = new Question(1,"Hello?", true);
	private User user1 = new User(3, "Anika", "Anika123@wayne.edu"," 1234", true, "student");
private Date date1 = new Date(); 

	@Test
	public void testGetID() {
		int id = 3;
		
		Question question = new Question(user1,null,"Hello?", date1);
		question.setId(id);
		assertEquals(id,question.getId());


	}

	@Test
	public void testSetID() {
		int id = 1;
		Question question = new Question();
		question.setId(id);
		assertEquals(id,question.getId());
	}

	@Test
	public void testGetQUESTION() {
		String ques = "Hello?";
		Question question = new Question(user1,null,ques,date1);
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
		Question question = new Question(null, null);
		assertEquals(false,question.isIs_answered());
	}

	@Test
	public void testGetANSWER() {
		String str = "is this a answer?";
		Question question = new Question(null, null);
		question.setANSWER(str);
		assertEquals(str, question.getANSWER());
		
	}
}