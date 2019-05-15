package GradeSystemProject.src.gradesystemproject;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Unit2 {
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
	public void testUpdateGrade(){
		String input = "30 30 30 5 5 Y";
		System.setIn(new java.io.ByteArrayInputStream(input.getBytes()));
		gs.UpdateGrade();
		
		//gs.UpdateGrade();
		
		//double temp[] = {0.3,0.3,0.3,0.05,0.05};
		assertEquals(0.3,GradeSystem.mul[0],0.01);
		assertEquals(0.3,GradeSystem.mul[1],0.01);
		assertEquals(0.3,GradeSystem.mul[2],0.01);
		assertEquals(0.05,GradeSystem.mul[3],0.01);
		assertEquals(0.05,GradeSystem.mul[4],0.01);
	}
}
