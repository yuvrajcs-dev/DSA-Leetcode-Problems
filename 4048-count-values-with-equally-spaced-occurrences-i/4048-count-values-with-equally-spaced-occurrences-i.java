class Solution {
    public int countSpecialIntegers(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=1;i<=100;i++){
            int f=-1;
            int s=-1;
            int t=-1;
            int frequency=0;
            for(int j=0;j<n;j++){
                if(nums[j]==i){
                    frequency++;
                    if(f==-1){
                        f=j;
                    }
                    else if(s==-1){
                        s=j;
                    }else if(t==-1){
                        t=j;
                    }
                }
                
            }
            if(frequency==3){
                if(s-f==t-s){
                    count++;
                }
            }

        }
        return count;
    }
}