package GradeSystemProject.src.gradesystemproject;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Integrate1 {
	GradeSystem gs;
	@Before
	public void setUp() throws Exception {
		gs = new GradeSystem();
	}

	@After
	public void tearDown() throws Exception {
		gs = null;
	}

	@Test
	public void test1() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		  System.setOut (new PrintStream (outContent));
		  gs.ShowGrade("985002002");
		 assertEquals("林芯妤成績:\r\nlab1:99\r\nlab2:81\r\nlab3:91\r\nmid-term:92\r\nfinal-exam:95\r\ntotal-grade:93\r\n", outContent.toString());
		 System.setOut (System.out);
		 
		 assertEquals(gs.ShowRank("985002002"),8);
		 assertEquals(gs.ShowAverage(),89);
		 
		 String input = "100 0 0 0 0 Y";
		 System.setIn(new java.io.ByteArrayInputStream(input.getBytes()));
		 gs.UpdateGrade();
			assertEquals(1.0,GradeSystem.mul[0],0.01);
			assertEquals(0,GradeSystem.mul[1],0.01);
			assertEquals(0,GradeSystem.mul[2],0.01);
			assertEquals(0,GradeSystem.mul[3],0.01);
			assertEquals(0,GradeSystem.mul[4],0.01);
			
			 assertEquals(gs.ShowRank("985002002"),1);
			 assertEquals(gs.ShowAverage(),90);
			 
		 
			
		 
	}

}
