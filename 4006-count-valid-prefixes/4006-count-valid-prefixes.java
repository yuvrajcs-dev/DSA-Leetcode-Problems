class Solution {
    public int countValidPrefixes(String s) {
        int ans=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            String su=s.substring(0,i+1);
            int c0=0;
            int c1=0;
            for(int j=0;j<su.length();j++){
                if(su.charAt(j)=='0'){
                    c0++;
                }else{
                    c1++;
                }
            }
            if (Math.abs(c0 - c1) <= 1) {
                ans++;
            }
        }
        return ans;
    }
}