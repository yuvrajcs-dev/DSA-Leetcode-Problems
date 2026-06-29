class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int n=word.length();
        int count=0;
        for(int i=0;i<patterns.length;i++){
            for(int j=0;j<n;j++){
                if(word.contains(patterns[i])){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}