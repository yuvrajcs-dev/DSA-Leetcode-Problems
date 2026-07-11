class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ele : nums){
            map.put(ele,map.getOrDefault(ele,0)+1);

        }
        for(int n : map.values()){
            if(n<2){
                continue;
            }
            boolean isprime=true;
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime){
                return true;
            }
        }
        return false;
    }

}
