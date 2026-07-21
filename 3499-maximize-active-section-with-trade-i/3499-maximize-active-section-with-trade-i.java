class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int ones = 0;

        for (char c : s.toCharArray()) {
            if (c == '1')
                ones++;
        }

        String t = "1" + s + "1";

        ArrayList<Integer> len = new ArrayList<>();
        ArrayList<Character> type = new ArrayList<>();

        int i = 0;

        while (i < t.length()) {

            char ch = t.charAt(i);
            int cnt = 0;

            while (i < t.length() && t.charAt(i) == ch) {
                cnt++;
                i++;
            }

            type.add(ch);
            len.add(cnt);
        }

        int ans = ones;

        for (i = 1; i < type.size() - 1; i++) {

            if (type.get(i) == '1'
                    && type.get(i - 1) == '0'
                    && type.get(i + 1) == '0') {

                int gain = len.get(i - 1) + len.get(i + 1);

                ans = Math.max(ans, ones + gain);
            }
        }

        return ans;
    }
}