package GradeSystemProject.src.gradesystemproject;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Unit3 {
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
	public void testShowRank() {
		assertEquals(gs.ShowRank("975002070"),1);
		
	}
	
	@Test
	public void testShowAverage() {
		assertEquals(gs.ShowAverage(),89);
	}
	
	
	@Test
	public void testShowGrade() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		  System.setOut (new PrintStream (outContent));
		  gs.ShowGrade("975002070");
		 assertEquals("楊宗穎成績:\r\nlab1:93\r\nlab2:93\r\nlab3:97\r\nmid-term:96\r\nfinal-exam:94\r\ntotal-grade:95\r\n", outContent.toString());
		 System.setOut (System.out);
	}
	

}
