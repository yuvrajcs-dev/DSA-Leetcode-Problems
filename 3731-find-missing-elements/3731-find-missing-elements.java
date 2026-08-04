class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();


        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }
        Arrays.sort(nums);
        for (int i = nums[0]; i <= nums[nums.length - 1]; i++) {
            if (!set.contains(i)) {
                ans.add(i);
            }
        }

        return ans;
        

    }
}