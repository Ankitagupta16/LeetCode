/**
* Given an array nums of integers, return how many of them contain an even number of digits.
*/

//without using function 
class Solution {
    public int findNumbers(int[] nums) {
        int count =0;
        for(int i=0;i<nums.length;i++)
        {
            int digit=0;
            while(nums[i]!=0)
            {
                nums[i]=nums[i]/10;
                digit++;
            }
            if(digit%2==0)
                count++;
        }
        return count;
        
    }
}

//using function
class Solution {
    
    public int findNumbers(int[] nums) {
        int count =0;
        for(int i=0;i<nums.length;i++)
        {
            if(Integer.toString(nums[i]).length() %2==0)
                count++;
        }
        return count;
        
    }
}
