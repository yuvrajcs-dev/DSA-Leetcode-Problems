class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double ans=Integer.MIN_VALUE;
        for(int i=0;i<=n-k;i++){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum+=nums[j];
            }

            ans=Math.max(ans,sum);


        }
        return (double)ans/k;

    }
}