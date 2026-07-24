class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans=new ArrayList<>();
        int minlen=String.valueOf(low).length();
        int maxlen=String.valueOf(high).length();
        String s="123456789";
        for(int len=minlen;len<=maxlen;len++){
            for(int start=0;start+len<=9;start++){
                String temp=s.substring(start,start+len);
                int num=Integer.parseInt(temp);
                if(num>=low && num<=high){
                    ans.add(num);
                }
                
            }
        }
        return ans;

    }
}