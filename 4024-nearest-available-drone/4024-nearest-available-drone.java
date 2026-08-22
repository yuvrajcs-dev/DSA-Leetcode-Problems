class Solution {
    public int nearestDrone(int[][] nums, int[] target) {
        int n=nums.length;
        int ans=-1;
        int a=Integer.MAX_VALUE;
        for(int i=0 ;i<n;i++){
            int diff=(Math.abs(nums[i][0]-target[0])+Math.abs(nums[i][1]-target[1]));
            if(diff<=nums[i][2]){
                if(diff<a){
                    a=diff;
                    ans=i;
                }
                
            }
        }
        return ans;
        
    }
}