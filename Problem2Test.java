package problem4;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Problem2Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetAlerts1() {
		Problem2 problem2 = new Problem2();
		Problem2Class problem2Class = new Problem2Class();
		problem2Class.setRed_light(true);
		problem2Class.setYellow_light(true);
		problem2Class.setGreen_light(true);
		problem2Class.setChime(false);
		problem2.setAlerts(9.9, problem2Class );
		assertEquals(false,problem2Class.isRed_light());
		assertEquals(false,problem2Class.isYellow_light());
		assertEquals(false,problem2Class.isGreen_light());
		assertEquals(true,problem2Class.isChime());
	}


	@Test
	public void testSetAlerts2() {
		Problem2 problem2 = new Problem2();
		Problem2Class problem2Class = new Problem2Class();
		problem2Class.setRed_light(false);
		problem2Class.setYellow_light(true);
		problem2Class.setGreen_light(true);
		problem2Class.setChime(true);
		problem2.setAlerts(19.9, problem2Class );
		assertEquals(true,problem2Class.isRed_light());
		assertEquals(false,problem2Class.isYellow_light());
		assertEquals(false,problem2Class.isGreen_light());
		assertEquals(false,problem2Class.isChime());
	}

	@Test
	public void testSetAlerts3() {
		Problem2 problem2 = new Problem2();
		Problem2Class problem2Class = new Problem2Class();
		problem2Class.setRed_light(true);
		problem2Class.setYellow_light(false);
		problem2Class.setGreen_light(true);
		problem2Class.setChime(true);
		problem2.setAlerts(29.9, problem2Class );
		assertEquals(false,problem2Class.isRed_light());
		assertEquals(true,problem2Class.isYellow_light());
		assertEquals(false,problem2Class.isGreen_light());
		assertEquals(false,problem2Class.isChime());
	}

	@Test
	public void testSetAlerts4() {
		Problem2 problem2 = new Problem2();
		Problem2Class problem2Class = new Problem2Class();
		problem2Class.setRed_light(true);
		problem2Class.setYellow_light(true);
		problem2Class.setGreen_light(false);
		problem2Class.setChime(true);
		problem2.setAlerts(99.9, problem2Class );
		assertEquals(false,problem2Class.isRed_light());
		assertEquals(false,problem2Class.isYellow_light());
		assertEquals(true,problem2Class.isGreen_light());
		assertEquals(false,problem2Class.isChime());
	}

	@Test
	public void testSetAlerts5() {
		Problem2 problem2 = new Problem2();
		Problem2Class problem2Class = new Problem2Class();
		problem2Class.setRed_light(true);
		problem2Class.setYellow_light(true);
		problem2Class.setGreen_light(true);
		problem2Class.setChime(true);
		problem2.setAlerts(100.0, problem2Class );
		assertEquals(false,problem2Class.isRed_light());
		assertEquals(false,problem2Class.isYellow_light());
		assertEquals(false,problem2Class.isGreen_light());
		assertEquals(false,problem2Class.isChime());
	}

	@Test
	public void testSetAlerts6() {
		Problem2 problem2 = new Problem2();
		Problem2Class problem2Class = new Problem2Class();
		problem2Class.setRed_light(true);
		problem2Class.setYellow_light(true);
		problem2Class.setGreen_light(true);
		problem2Class.setChime(false);
		problem2.setAlerts(0.0, problem2Class );
		assertEquals(false,problem2Class.isRed_light());
		assertEquals(false,problem2Class.isYellow_light());
		assertEquals(false,problem2Class.isGreen_light());
		assertEquals(true,problem2Class.isChime());
		
	}

	@Test
	public void testSetAlerts7() {
		Problem2 problem2 = new Problem2();
		Problem2Class problem2Class = new Problem2Class();
		problem2Class.setRed_light(false);
		problem2Class.setYellow_light(true);
		problem2Class.setGreen_light(true);
		problem2Class.setChime(true);
		problem2.setAlerts(10.0, problem2Class );
		assertEquals(true,problem2Class.isRed_light());
		assertEquals(false,problem2Class.isYellow_light());
		assertEquals(false,problem2Class.isGreen_light());
		assertEquals(false,problem2Class.isChime());
		
	}

	@Test
	public void testSetAlerts8() {
		Problem2 problem2 = new Problem2();
		Problem2Class problem2Class = new Problem2Class();
		problem2Class.setRed_light(true);
		problem2Class.setYellow_light(false);
		problem2Class.setGreen_light(true);
		problem2Class.setChime(true);
		problem2.setAlerts(20.0, problem2Class );
		assertEquals(false,problem2Class.isRed_light());
		assertEquals(true,problem2Class.isYellow_light());
		assertEquals(false,problem2Class.isGreen_light());
		assertEquals(false,problem2Class.isChime());
 		
	}

	@Test
	public void testSetAlerts9() {
		Problem2 problem2 = new Problem2();
		Problem2Class problem2Class = new Problem2Class();
		problem2Class.setRed_light(true);
		problem2Class.setYellow_light(true);
		problem2Class.setGreen_light(false);
		problem2Class.setChime(true);
		problem2.setAlerts(30.0, problem2Class );
		assertEquals(false,problem2Class.isRed_light());
		assertEquals(false,problem2Class.isYellow_light());
		assertEquals(true,problem2Class.isGreen_light());
		assertEquals(false,problem2Class.isChime());
		
	}

	@Test
	public void testSetAlerts10() {
		Problem2 problem2 = new Problem2();
		Problem2Class problem2Class = new Problem2Class();
		problem2Class.setRed_light(true);
		problem2Class.setYellow_light(true);
		problem2Class.setGreen_light(true);
		problem2Class.setChime(true);
		problem2.setAlerts(100.1, problem2Class );
		assertEquals(false,problem2Class.isRed_light());
		assertEquals(false,problem2Class.isYellow_light());
		assertEquals(false,problem2Class.isGreen_light());
		assertEquals(false,problem2Class.isChime());
	}

	
}
