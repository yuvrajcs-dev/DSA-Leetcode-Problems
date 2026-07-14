class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans=new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());
        HashSet<Integer> n1=new HashSet<>();
        HashSet<Integer> n2=new HashSet<>();
        for(int e : nums1){
            n1.add(e);
        }
        for(int e :nums2){
            n2.add(e);
        }
        for(int e : n1){
            if(!n2.contains(e)){
                ans.get(0).add(e);
            }
        }
        for(int e: n2){
            if(!n1.contains(e)){
                ans.get(1).add(e);
            }
        }
        return ans;
    }
}