class Solution {
    public int peakValleyDifference(int[] nums) {
        int n=nums.length;
        int peak=0;
        int valley=0;
        for(int i=0;i<n;i++){
            if(i>0 && i<n-1 && nums[i]<nums[i-1] && nums[i]<nums[i+1]){
                valley+=nums[i];
            }
             if(i>0 && i<n-1 && nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                peak+=nums[i];
            }
        }
        return peak-valley;
    }
}