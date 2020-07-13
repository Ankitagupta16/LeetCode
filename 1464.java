class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return ((nums[nums.length-1]-1)*(nums[nums.length-2]-1));
    }
}



class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int sub = Integer.MIN_VALUE;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                sub = max;
                max = nums[i];
            } else if (nums[i] > sub) {
                sub = nums[i];
            }
        }
        
        return (max-1) * (sub - 1);
    }
}
