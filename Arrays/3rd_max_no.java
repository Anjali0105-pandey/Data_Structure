/*Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

 

Example 1:

Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.
Example 2:

Input: nums = [1,2]
Output: 2
Explanation:
The first distinct maximum is 2.
The second distinct maximum is 1.
The third distinct maximum does not exist, so the maximum (2) is returned instead.
Example 3:

Input: nums = [2,2,3,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2 (both 2's are counted together since they have the same value).
The third distinct maximum is 1. */
import java.util.*;
class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 1;
        int flag = 0;
        for(int i=n-1;i>0;i--){
            if(nums[i] == nums[i-1]){
                flag = flag + 1; // for checking how many times max or second max value repeating
            }
            else{
                count = count + 1; // for getting distinct max value count (until 3rd max value)
            }
            if(count == 3){
                return nums[n-count-flag]; // n=total value , count = 3, flag = how many times max or second max repeating
            }
        }
    return nums[n-1];
            
    }
}
