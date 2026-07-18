class Solution {
    public String rearrangeString(String s, char x, char y) {
        char[] arr=s.toCharArray();
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==y){
                char tem=arr[i];
                arr[i]=arr[j];
                arr[j]=tem;
                j++;
            }
        }
        return new String(arr);
    }
}