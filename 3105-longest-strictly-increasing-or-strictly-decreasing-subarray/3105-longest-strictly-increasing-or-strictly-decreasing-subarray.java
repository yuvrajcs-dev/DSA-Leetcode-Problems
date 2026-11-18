class Solution {
    public int longestMonotonicSubarray(int[] arr) {
        int n=arr.length;
        int ans=1;
        int inc=1;
        int dec=1;
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i]){
                inc++;
                ans=Math.max(ans,inc);
                
            }else{
                inc=1;
            }
            
        }
        for(int i=1;i<n;i++){
            if(arr[i-1]<arr[i]){
                dec++;
                ans=Math.max(ans,dec);
                
            }else{
                dec=1;
            }
            
        }
        return ans;
    }
}