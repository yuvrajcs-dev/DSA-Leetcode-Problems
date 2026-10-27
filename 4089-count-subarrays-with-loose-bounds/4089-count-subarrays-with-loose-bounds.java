class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int n=nums.length;
        long ans=0;
        long count=0;
        for(int i=0;i<n;i++){
            if(nums[i]>=minK && nums[i]<=maxK){
                count++;
            }else{
                count=0;
            }
            ans+=count;
        }
        return ans;
    }
}