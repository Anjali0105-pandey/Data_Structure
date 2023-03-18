/*Sort Array By Parity

Solution
Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return any array that satisfies this condition.

 

Example 1:

Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
Example 2:

Input: nums = [0]
Output: [0] */

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int p1 = 0;
        int p2 = 0;
        while(p2<nums.length){
            if(nums[p2]%2==0){
                int temp = nums[p1];
                nums[p1++] = nums[p2];
                nums[p2++] = temp;
            }
            else p2++;
        }
        return nums;
    }
}