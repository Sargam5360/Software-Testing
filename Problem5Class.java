package problem4;
 
public class Problem5Class {

	public static int numNeg (int[] vals) {
    	int times = 0, j=vals.length-1;
    	for (int i = j; i >=0; i--)
    		if (vals[i] < 0)
    			times++;

    	return times;
	}
	/*
	
	public static void main(String args[])
	{
		int arr[]={-4,5};
		int ans = numNeg(arr);
		System.out.println(numNeg(arr));
		
	}*/
}