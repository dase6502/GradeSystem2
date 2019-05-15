package GradeSystemProject.src.gradesystemproject;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.*;

public class Unit1 {
	//GradeSystemProject gsp;
	GradeSystem gs;
	@Before
	public void setUp() throws Exception {
		//gsp = new GradeSystemProject();
		gs = new GradeSystem();
		
	}

	@After
	public void tearDown() throws Exception {
		gs = null;
		//gsp = null;
	}

	
	
	@Test
	public void testShowRank() {
		assertEquals(gs.ShowRank("965002038"),58);
		
	}
	
	@Test
	public void testShowAverage() {
		assertEquals(gs.ShowAverage(),89);
	}
	
	
	@Test
	public void testShowGrade() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		  System.setOut (new PrintStream (outContent));
		  gs.ShowGrade("975002026");
		 assertEquals("楊永成成績:\r\nlab1:85\r\nlab2:90\r\nlab3:82\r\nmid-term:93\r\nfinal-exam:85\r\ntotal-grade:88\r\n", outContent.toString());
		 System.setOut (System.out);
	}
	

	

}
