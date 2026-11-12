class Solution {
    public int minMergedInteger(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n/2];
        int j=0;
        for(int i=0;i<n-1;i+=2){
            String res=String.valueOf(nums[i])+nums[i+1];
            ans[j]=Integer.parseInt(res);
            j++;
        } 
        Arrays.sort(ans);
        return ans[0];
    }
}