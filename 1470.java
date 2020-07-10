/**
* Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
* Return the array in the form [x1,y1,x2,y2,...,xn,yn].
*/


class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result= new int[n*2];
        int j=0;
        for(int i=0;i<n;i++)
        {
            result[j++]=nums[i];
            result[j++]=nums[n+i];
        }
        return result;
    }
}
