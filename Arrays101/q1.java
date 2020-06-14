//Given a binary array, find the maximum number of consecutive 1s in this array.

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       if (nums == null || nums.length == 0)
            return 0;
        int max = 0;
        for (int i = 0; i < nums.length; ++i)
        {
            int start = i;
            while (i + 1 < nums.length && nums[i + 1] == nums[i])
                ++i;
            if (nums[start] == 1)
                max = Math.max(max, i - start + 1);
        }
        return max;
    }
}
