class Solution {
    public int maxProduct(int n) {
        int o=String.valueOf(n).length();
        int[] arr=new int[o];
        for(int i=0;i<o;i++){
            int rem=n%10;
            arr[i]=rem;
            n/=10;
        }
        Arrays.sort(arr);
        return arr[o-1]*arr[o-2];
    }
}