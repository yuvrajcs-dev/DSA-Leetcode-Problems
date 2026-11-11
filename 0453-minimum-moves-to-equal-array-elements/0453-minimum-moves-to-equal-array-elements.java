class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int first=nums[0];
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=Math.abs(nums[i]-nums[0]);
        }
        return ans;
    }
}