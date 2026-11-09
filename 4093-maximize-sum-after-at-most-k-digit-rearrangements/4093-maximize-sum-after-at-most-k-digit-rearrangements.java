class Solution {
    public long maximizeSum(int[] nums, int k) {
        long sum = 0;
        int n = nums.length;

        long[] gains = new long[n];

        for (int i = 0; i < n; i++) {

            sum += nums[i];

            char[] digits =
                String.valueOf(nums[i]).toCharArray();

            Arrays.sort(digits);

            long maxNumber = 0;

            for (int j = digits.length - 1; j >= 0; j--) {
                maxNumber = maxNumber * 10
                          + (digits[j] - '0');
            }

            gains[i] = maxNumber - nums[i];
        }

        Arrays.sort(gains);

        for (int i = n - 1; i >= n - k; i--) {
            sum += gains[i];
        }

        return sum;
    }
}