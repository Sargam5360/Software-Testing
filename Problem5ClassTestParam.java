package problem4;
import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class Problem5ClassTestParam {
	@SuppressWarnings("unused")
	private static final Object[] parametersForProblemFive () {
		return $(
//				Parameters are: (1,2)
//								1) input invoice
//								2) input credit
//								3) input balance
	//							4) input interest
		//						5) expected output
		 		
				$($(2))
				//$($(0),0)
				/*$(1000.00, 5000.00, 2000.00,0.17,false),
				$(1000.01, 4999.99, 2000.00,0.17,false),
				$(1000.01, 5000.00, 2000.01,0.17,false),
				$(1000.01, 5000.00, 2000.00,0.18,false),
				$(0.0, 0.0, 0.0,0.0,false),
				$( 1000.00, 1000.00, 1000.00,0.4,false)
			 
				*/
		);
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

	 
	@SuppressWarnings("deprecation")
	@Test
	@Parameters(method="parametersForProblemFive")
	public void testNumNeg(int[] a) {
		//int b[]={4,6};
		Problem5Class p =new Problem5Class();
		System.out.println(p.numNeg(a));
 	}

}
