class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int ans = nums[0];
        if(n == 1 || nums[n-1] != nums[n-2]) return nums[n-1];
        for(int i=1; i<n-1; i++){
            if(nums[i] != nums[i+1] && nums[i] != nums[i-1]){
                ans = nums[i];
                break;
            }
        }
        return ans;
    }
}