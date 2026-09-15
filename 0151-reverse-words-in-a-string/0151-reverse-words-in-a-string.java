class Solution {
    public String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        int n=str.length;
        int i=0;
        int j=n-1;
        while(i<j){
            String temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            i++;
            j--;
        }
        String m = String.join(" ", str);
        return m;

    }
}