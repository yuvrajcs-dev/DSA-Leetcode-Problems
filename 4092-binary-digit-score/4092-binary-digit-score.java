class Solution {
    public int calculateScore(int a, int b) {
        String s1=Integer.toBinaryString(a);
        String s2=Integer.toBinaryString(b);
        int c1=0;
        int c2=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)=='1'){
                c1++;
            }
        }
        for(int j=0;j<s2.length();j++){
            if(s2.charAt(j)=='1'){
                c2++;
            }
        }
        if(c1>=c2){
            return c1*c2;
        }else{
            if(c2==0){
                return 0;
            }
            return c2/c1;
        }
    }
}