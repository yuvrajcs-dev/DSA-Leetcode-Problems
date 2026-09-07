class Solution {
    public int countRotations(String s, int k) {
        int n = s.length();
        int c = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == s.charAt((i + 1) % n)) {
                c++;
            }
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            int score;

            if (s.charAt(i) == s.charAt((i + 1) % n)) {
                score = c - 1;
            } else {
                score = c;
            }

            if (score == k) {
                ans++;
            }
        }

        return ans;
    }
}