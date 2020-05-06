/**
*Given an array of size n, find the majority element. 
*The majority element is the element that appears more than ⌊ n/2 ⌋ times.
*You may assume that the array is non-empty and the majority element always exist in the array.
*/


class Solution {
    public int majorityElement(int[] nums) {
        int count;
        for(int x : nums)
        {
            count=0;
            for(int y : nums)
            {
                if(y==x)
                    count++;
            }
            if(count>(nums.length/2))
                return x;
        }
      return -1; 
    }
}
