public class ReverseArray {
	
	//Hacker rank problem
	//https://www.hackerrank.com/challenges/arrays-ds/problem

	    static int[] reverseArray(int[] a) 
	    {	
	    	//new reversed array declaration with length same as input array
	    	int[] reversed_nums = new int[a.length];
	    	//variable j for reversed array
	    	int j=0;
	    	//for loop to traverse through the old array from last element
	    	for (int i = a.length -1; i>=0; i--)
	    	{
	    		//new array elements from old array from last element
	    		reversed_nums[j] = a[i];
	    		//incrementing j
	    		j++;
	    		//print elements a[i]
	    		System.out.print(a[i]);
	    		//print space between array elements
	    		System.out.print(" ");
	    	}
	    	//returning reversed array
	    	return reversed_nums;
	    }
	    
	    public static void main(String args[])
	    {
	    	//original array
	    	int[] a = {7,8,4,9};
	    	//calling the reversedArray function in main
	    	reverseArray(a);
	    }

}
