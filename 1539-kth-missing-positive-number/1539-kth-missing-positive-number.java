class Solution {
    public int findKthPositive(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        List<Integer> arr = new ArrayList<>();

        for (int i = 1; i <= nums[nums.length - 1] + k; i++) {
            if (!set.contains(i)) {
                arr.add(i);
            }
        }

        return arr.get(k - 1);
    }
}