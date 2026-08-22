class Solution {
    public int minPenalty(int period, int[] lights, int[] arr) {
        int n=lights.length;
        Arrays.sort(lights);
        int m=arr.length;
        int ans=0;
        for(int i=0;i<m;i++){
            int r=arr[i]%period;
            if(r>=lights[n-1]){
                ans=Math.max(ans,period-r);
            }
        }
        return ans;
    }
}