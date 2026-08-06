class Solution {
    public int smallestNumber(int n, int t) {
        if(n<t){
            return t;
        }
        while (true) {
            int temp = n;
            int mul = 1;
            while (temp != 0) {
                int rem = temp % 10;
                mul *= rem;
                temp /= 10;
            }
            if(mul%t==0){
                return n;
            }else{
                n++;
            }
        }
    }
}