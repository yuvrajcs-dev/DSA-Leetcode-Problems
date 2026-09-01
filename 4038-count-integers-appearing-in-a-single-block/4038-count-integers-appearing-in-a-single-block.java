class Solution {
    public int countSpecialIntegers(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
            boolean found=true;
            for(int j=0;j<i;j++){
                if(nums[j]==nums[i]){
                    found=false;
                    break;
                }
            }
            if(!found){
                continue;
            }
            int last=i;
            for(int j=i+1;j<n;j++){
                if(nums[j]==nums[i]){
                    last=j;
                }
            }
            boolean spec=true;
            for (int j=i;j<=last;j++) {
                if (nums[j]!=nums[i]) {
                    spec=false;
                    break;
                }
            }
            if(spec){
                ans++;
            }
        }
        return ans;
    }
}