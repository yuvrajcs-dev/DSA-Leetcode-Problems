class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans=new ArrayList<>();
        String s="123456789";
        int min=String.valueOf(low).length();
        int max=String.valueOf(high).length();
        for(int i=min;i<=max;i++){
            for(int j=0;j+i<=9;j++){
                String temp=s.substring(j,j+i);
                int num=Integer.parseInt(temp);
                if(num>=low && num<=high){
                    ans.add(num);
                }
            }
        }
        return ans;
    }
}