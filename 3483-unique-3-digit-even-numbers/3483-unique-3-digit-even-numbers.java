class Solution {
    public int totalNumbers(int[] digits) {
        int[] freq = new int[10];
        for(int d : digits) {
            freq[d]++;
        }
        int ans = 0;

        for(int num = 100; num <= 999; num++) {

            int a = num / 100;
            int b = (num / 10) % 10;
            int c = num % 10;

            if(c % 2 != 0) {
                continue;
            }

            freq[a]--;
            freq[b]--;
            freq[c]--;

            if(freq[a] >= 0 && freq[b] >= 0 && freq[c] >= 0) {
                ans++;
            }

            freq[a]++;
            freq[b]++;
            freq[c]++;
        }

        return ans;
    }
}