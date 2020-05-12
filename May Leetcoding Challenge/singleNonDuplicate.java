/**
*You are given a sorted array consisting of only integers 
*where every element appears exactly twice, except for one 
*element which appears exactly once. 
*Find this single element that appears only once.
*/

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i=0;
        if(nums.length==1)
            return nums[i];
        while(i<nums.length-1)
        {
            if(nums[i]!=nums[i+1])
                break;
            i=i+2;
        }
        return nums[i];
    }
}
