class Solution {
    public String rearrangeString(String s, char x, char y) {
        char[] arr=s.toCharArray();
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==y){
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        return new String(arr);
    }
}