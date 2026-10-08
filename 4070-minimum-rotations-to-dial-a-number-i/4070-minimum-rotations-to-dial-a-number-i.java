class Solution {
    public int minRotations(String s) {
    int sum = 0;
    int current = 0;

    for (int i = 0; i < s.length(); i++) {
        int next = s.charAt(i) - '0';

        int diff = Math.abs(current - next);

        sum += Math.min(diff, 10 - diff);

        current = next;
    }

    return sum;

    }
}