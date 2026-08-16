class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int m=requests.length;
        int ans=requests[0];
        for(int i=1;i<m;i++){
            ans+= Math.abs(requests[i]-requests[i-1]);
        }
        return ans;
    }
}