class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int left = 0, right = nums.length-1;
        double average = nums[right];
        while(left < right)
            average = Math.min(((nums[left++]+nums[right--])/2D) , average); 
        return average;
    }
}