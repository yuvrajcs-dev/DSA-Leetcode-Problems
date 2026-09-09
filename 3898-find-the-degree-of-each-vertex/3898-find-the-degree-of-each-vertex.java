class Solution {
    public int[] findDegrees(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int[] ans=new int[r];
        for(int i=0;i<r;i++){
            int count=0;
            for(int j=0;j<c;j++){
                if(matrix[i][j]==1){
                    count++;
                }
            }
            ans[i]=count;
        }
        return ans;
    }
}