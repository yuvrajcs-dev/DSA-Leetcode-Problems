class Solution {
    public int maxDigitRange(int[] nums) {
        int maxRange = Integer.MIN_VALUE;
        int ans = 0;

        for (int num : nums) {
            int range = getDigitRange(num);
            maxRange = Math.max(maxRange, range);
        }

        for (int num : nums) {
            if (getDigitRange(num) == maxRange) {
                ans += num;
            }
        }

        return ans;
    }

    private int getDigitRange(int num) {
        int maxDigit = 0;
        int minDigit = 9;

        if (num == 0) return 0;

        while (num > 0) {
            int digit = num % 10;
            maxDigit = Math.max(maxDigit, digit);
            minDigit = Math.min(minDigit, digit);
            num /= 10;
        }

        return maxDigit - minDigit;
    }
}