class Solution {
    public long countValidSubstrings(String s) {
        long count=0;
        int n=s.length();
        int lastinvalid=-1;
        for(int i=0;i<n;i++){
            if(i>=2 && s.charAt(i-2)=='a' && s.charAt(i-1)=='b' && s.charAt(i)=='c' ){
                lastinvalid=i-2;
            }
            count+= i-lastinvalid;
        }
        return count;
        
    }
}