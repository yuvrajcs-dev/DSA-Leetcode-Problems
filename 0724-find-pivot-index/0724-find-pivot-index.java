class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int totalsum=0;
        for(int i=0 ;i<n;i++){
            totalsum+=nums[i];
        }
        int left=0;
        for(int i=0;i<n;i++){
            if((totalsum-left-nums[i])==left){
                return i;
            }
            left+=nums[i];
        }
        return -1;


        
    }
}