package problem4;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Problem5ClassTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testNumNeg() {
		int arr[]={-1};
	 Problem5Class num=new Problem5Class();
		int ans = num.numNeg(arr);
		assertEquals(1,ans);
	}

	@Test
	public void testNumNeg1() {
		int arr[] = {0};
	 Problem5Class num=new Problem5Class();
		int ans = num.numNeg(arr);
		assertEquals(0,ans);
	}
	
	@Test
	public void testNumNeg2() {
		int arr[]={};
	 Problem5Class num=new Problem5Class();
		int ans = num.numNeg(arr);
		assertEquals(0,ans);
	}
	
	@Test
	public void testNumNeg3() {
		int arr[]={0,1,2,3};
	 Problem5Class num=new Problem5Class();
		int ans = num.numNeg(arr);
		assertEquals(0,ans);
	}
	@Test
	public void testNumNeg4() {
		int arr[]={-3,0,3,5};
	 Problem5Class num=new Problem5Class();
		int ans = num.numNeg(arr);
		assertEquals(1,ans);
	}
	@Test
	public void testNumNeg5() {
		int arr[]={0,8,4,-3};
	 Problem5Class num=new Problem5Class();
		int ans = num.numNeg(arr);
		assertEquals(1,ans);
	}
	 
	@Test
	public void testNumNeg6() {
		int arr[]={0,-4,-2,7};
	 Problem5Class num=new Problem5Class();
		int ans = num.numNeg(arr);
		assertEquals(2,ans);
	}
}
