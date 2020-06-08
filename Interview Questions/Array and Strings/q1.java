/**
*Given an array nums of n integers where n > 1,  
*return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
*/


/**
*Time Complexity= O(n)
*/
class Solution {
    public int[] productExceptSelf(int[] nums) {

        int N = nums.length;
        
        int[] result = new int[N];
        
        // Get product of all numbers to left of each index.
        int toLeft = nums[0];
        
        for (int i = 1; i < N; i++) {
            result[i] = toLeft;
            toLeft *= nums[i];
        }
        
        // Multiply by product of all numbers to right as well.
        int toRight = nums[N-1];
        result[0] = 1;
        
        for (int i = N-2; i >= 0; i--) {
            result[i] *= toRight;
            toRight *= nums[i];
        }
        
        return result;
    }
      
}
