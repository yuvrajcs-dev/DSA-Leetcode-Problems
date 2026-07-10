class Solution {
    public boolean judgeCircle(String moves) {
        int x=0;
        int y=0;
        for(char ele : moves.toCharArray()){
            if(ele=='L'){
                x--;
            }else if(ele=='R'){
                x++;
            }else if(ele=='U'){
                y++;
            }else{
                y--;
            }
        }
        return x==0 && y==0;
    }
}