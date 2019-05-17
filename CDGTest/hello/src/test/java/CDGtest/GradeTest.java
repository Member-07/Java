package CDGtest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import CDG.Grade;

public class GradeTest {
	Grade grade = new Grade();

	@Test
	public void score80gotA() {
		assertEquals("A", grade.grade(80));
	}
	
	@Test
	public void score79gotB() {
		assertEquals("B", grade.grade(79));
	}
	
	@Test
	public void score70gotB() {
		assertEquals("B", grade.grade(70));
	}
	
	@Test
	public void score69gotC() {
		assertEquals("C", grade.grade(69));
	}
	
	@Test
	public void score60gotC() {
		assertEquals("C", grade.grade(60));
	}
	
	@Test
	public void score59gotC() {
		assertEquals("D", grade.grade(59));
	}
	
	@Test
	public void score50gotC() {
		assertEquals("D", grade.grade(50));
	}
	
	@Test
	public void score49gotF() {
		assertEquals("F", grade.grade(49));
	}
	
	@Test
	public void score0gotF() {
		assertEquals("F", grade.grade(0));
	}

}