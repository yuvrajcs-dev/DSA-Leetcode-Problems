class Solution {
    public int largestInteger(int[] nums, int k) {
        
        int n = nums.length;
        int ans = -1;

        for (int num : nums) {

            int count = 0;

            // Har k-size subarray check karo
            for (int i = 0; i <= n - k; i++) {

                for (int j = i; j < i + k; j++) {
                    if (nums[j] == num) {
                        count++;
                        break;
                    }
                }
            }

            // Agar number exactly 1 subarray mein mila
            if (count == 1) {
                ans = Math.max(ans, num);
            }
        }

        return ans;
    }
}