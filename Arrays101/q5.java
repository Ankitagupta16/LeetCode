/**
* Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
* Note:
*  1. The number of elements initialized in nums1 and nums2 are m and n respectively.
*  2. You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
*/

//Time Complexity =O(n)

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       
       int i=m-1;
		int j=n-1;
		int k = m+n-1;
		while(i >=0 && j>=0)
		{
			if(nums1[i] > nums2[j])
				nums1[k--] = nums1[i--];
			else
				nums1[k--] = nums2[j--];
		}
		while(j>=0)
			nums1[k--] = nums2[j--]; 
            
    }
}
