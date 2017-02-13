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
public class Problem4modifiedTest {
	@SuppressWarnings("unused")
	private static final Object[] parametersForProblemFour () {
		return $(
//				Parameters are: (1,2)
//								1) input invoice
//								2) input credit
//								3) input balance
	//							4) input interest
		//						5) expected output
				 

				
				$(1000.01, 5000.00, 2000.00,0.17,true),
				$(1000.00, 5000.00, 2000.00,0.17,false),
				$(1000.01, 4999.99, 2000.00,0.17,false),
				$(1000.01, 5000.00, 2000.01,0.17,false),
				$(1000.01, 5000.00, 2000.00,0.18,false),
				$(0.0, 0.0, 0.0,0.0,false),
				$( 1000.00, 1000.00, 1000.00,0.4,false)
			 
				
		);
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	 
 
		@SuppressWarnings("deprecation")
		@Test
		@Parameters(method="parametersForProblemFour")
		public void testisCreditIncreasable( double invoice,double credit,double balance,double interest,boolean expected) {
			
			Problem4modified problem  = new Problem4modified();
			//System.out.println("Successful"+input+"Output"+problem4Class.calcY(input));
		problem.isCreditIncreasable(invoice, credit, balance, interest);
			//assertEquals(expected,problem4Class.isCreditIncreasable(invoice,credit,balance,interest),0.1 );
 			
	
	}

		 
		 

		 

}
