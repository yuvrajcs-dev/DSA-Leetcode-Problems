class Solution {
    public int findKthPositive(int[] nums, int k) {
        List<Integer> arr = new ArrayList<>();
        int n = nums.length;

        for (int i = 1; i <= nums[n - 1] + k; i++) {

            boolean found = false;

            for (int j = 0; j < n; j++) {
                if (nums[j] == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                arr.add(i);
            }
        }

        return arr.get(k - 1);
    }
}