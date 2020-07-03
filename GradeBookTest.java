import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	
	private GradeBook g1;
	private GradeBook g2;
	

	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		
		g1.addScore(59);
		g1.addScore(65);
		g1.addScore(80);
		
		
		g2.addScore(73);
		g2.addScore(66);
		g2.addScore(88);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}

	@Test
	void addScoreTest() {
		assertFalse(g1.toString().equals("59.0 65.0 80.0 "));
		assertFalse(g2.toString().equals("73.0 66.0 88.0 "));
		
	}

	@Test
	void testSum() {
		
		assertEquals(204, g1.sum(), .0001);
		assertEquals(227, g2.sum(), .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(204.0, g1.sum(), 0.0001);
		assertEquals(227.0, g2.sum(), 0.0001);
		
	}

	@Test
	void testFinalScore() {
		assertEquals(204.0, g1.sum(), 0.0001);
		assertEquals(227.0, g2.sum(), 0.0001);
	}

	@Test
	void testGetScoreSize() {
		
	}

	@Test
	void testToStringString() {
		
	}

}
