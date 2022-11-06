/*
Given an unsorted integer array, find a pair with the given sum in it.
Input:
nums = [8, 7, 2, 5, 3, 1]
target = 10
 
Output:
Pair found (8, 2)
or
Pair found (7, 3)
 
Input:
nums = [5, 2, 6, 8, 1, 9]
target = 12
Output: Pair not found
*/

class Main{

	public static void findPair(int[] nums, int target){
		for (int i = 0; i < nums.length - 1; i++){
			for (int j = i + 1; j < nums.length; j++){
				if (nums[i] + nums[j] == target){
					System.out.printf("Pair found (%d, %d)", nums[i], nums[j]);
					return;
				}
			}
		}
		System.out.println("Pair not found");
	}

	public static void main (String[] args){
		int[] nums = { 8, 7, 2, 5, 3, 1 };
		int target = 10;
		findPair(nums, target);
	}
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] nums = { 8, 7, 2, 5, 3, 1 };
        int target = 10;
 
        findPair(nums, target);
    }
    public static void printArr(int[] nums){
        for(int cc:nums){
            System.out.println(cc);
        }
    }
    
    public static void findPair(int[] nums, int target){
        Arrays.sort(nums);
        printArr(nums);
        int low = 0;
        int high = nums.length - 1;
        while(low<high){
            if(nums[low]+nums[high] == target){
                System.out.printf("Pair found (%d, %d)", nums[low], nums[high]);
                return;
            }
            if(nums[low]+nums[high] < target){
                low++;
            }
            else{
                high--;
            }
        }
        System.out.println("Pair not found");
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////

//import java.util.*;
import java.util.HashMap;
import java.util.Map;
class Main {
    public static void main(String[] args) {
        int[] nums = { 8, 7, 2, 5, 3, 1 };
        int target = 10;
        findPair(nums, target);
    }
    public static void printArr(int[] nums){
        for(int cc:nums){
            System.out.println(cc);
        }
    }
    
    public static void findPair(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                System.out.printf("Pair found (%d, %d)", nums[map.get(target - nums[i])], nums[i]);
                return;
            }
            map.put(nums[i], i);
        }
        System.out.println("Pair not found");
    }
}
