/*Move Zeroes

Solution
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0] */
class Solution {
    public void moveZeroes(int[] nums) {
        int idx0 = 0;
        boolean cond = false;
        //to check array contains 0 or not
        for(int i = 0; i< nums.length; i++){ 
            if(nums[i] == 0) cond = true;
        }
        if(cond){
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == 0){
                    idx0 = i;
                    for(int j = i+1; j < nums.length; j++){
                        if(nums[j] != 0){
                            int temp = nums[idx0];
                            nums[idx0] = nums[j];
                            nums[j] = temp;
                            break;
                        }
                    }
                }
            }
        }
    }
}

