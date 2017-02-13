package problem4;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;;


@RunWith(Parameterized.class)
public class Problem3ClassTest {

	//@Parameters
	private double invoice;
	private double credit;
	private double balance;
	private double interest;

	public Problem3ClassTest(double invoice, double credit,
			double balance, double interest) {
		
		this.invoice = invoice;
		this.credit = credit;
		this.balance = balance;
		this.interest = interest;

	}

	@Parameters
	public static Collection<Double[]> addedNumbers() {
		return Arrays.asList(new Double[][] { { 1000.01, 5000.00, 2000.00,0.17 },
			{1000.00, 5000.00, 2000.00,0.17 },
		{ 1000.01, 4999.99, 2000.00,0.17 },
		{ 1000.01, 5000.00, 2000.01,0.17 },
		{ 1000.01, 5000.00, 2000.00,0.18 },
		{ 0.0, 0.0, 0.0,0.0 },
		{ 1000.00, 1000.00, 1000.00,0.4 },
		
		});
	}

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
	public void testIsCreditIncreasable() {
 Problem3Class problem3Class = new Problem3Class();
 boolean e;
 e=problem3Class.isCreditIncreasable( invoice,  credit,balance, interest);

 System.out.println("Output :"+e);
if(invoice==1000.01 && credit==5000.00 && balance==2000.00 && interest==0.17)
	assertEquals(true,e); else assertEquals(false,e);
	
	}

	
}
