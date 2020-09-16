
public class monotonicArray {
	
		//Leetcode problem #896
		//Arrays high frequency
		// https://leetcode.com/problems/monotonic-array/
	
	public boolean isMonotonic(int[] A) {
		boolean increasing = true;
		boolean decreasing = true;
		for(int i = 0; i<A.length-1;i++) {
			if(A[i] > A[i+1])  increasing = false;
			if(A[i] < A[i+1])  decreasing = false;
		}
		
		return increasing || decreasing;
	}

}
