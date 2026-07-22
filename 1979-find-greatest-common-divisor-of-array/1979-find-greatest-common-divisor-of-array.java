class Solution {
    public int findGCD(int[] nums) {
        int n=nums.length;
        int max=nums[0];
        int min=nums[0];
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);

        }
        return gcd(max,min);
    }
    public int gcd(int m,int n){
        if(n==0){
            return m;
        }
        return gcd(n,m%n);
    }
}