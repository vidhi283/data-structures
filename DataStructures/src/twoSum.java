import java.util.HashMap;

public class twoSum {
	
	//Leetcode problem #1
	//Arrays high frequency
	// https://leetcode.com/problems/two-sum/
	
	public int[] twoSum(int nums[], int target) {
		HashMap<Integer, Integer> num_map = new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length;i++) {
			int complement = target - nums[i];
			if(num_map.containsKey(complement)) {
				return new int[] {num_map.get(complement),i};
			}
			num_map.put(nums[i], i);
		}
		throw new IllegalArgumentException("no match found !");
	}

}
