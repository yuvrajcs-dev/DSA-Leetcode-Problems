
class Solution {
    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for (int k = 1; k <= n; k++) {
            if (n % k != 0) {
                continue;
            }

            boolean valid = true;
            int prevMax = Integer.MIN_VALUE;

            for (int start = 0; start < n; start += k) {
                int end = start + k - 1;
                int min = nums[start];
                int max = nums[start];
                int descents = 0;

                for (int j = start; j <= end; j++) {
                    min = Math.min(min, nums[j]);
                    max = Math.max(max, nums[j]);

                    int next = (j == end) ? start : j + 1;
                    if (nums[j] > nums[next]) {
                        descents++;
                    }
                }

                // This block must be sortable by rotation.
                if (descents > 1 || prevMax > min) {
                    valid = false;
                    break;
                }

                prevMax = max;
            }

            if (valid) {
                ans += k;
            }
        }

        return ans;
    }
}
