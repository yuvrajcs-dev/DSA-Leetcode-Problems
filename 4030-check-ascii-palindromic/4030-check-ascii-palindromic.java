class Solution {
    public boolean isPalindromic(String s) {
        char[] arr = s.toCharArray();
        String binary = "";
        for (char ch : arr) {
            int ascii = (int) ch;
            binary += String.format("%8s", Integer.toBinaryString(ascii))
                            .replace(' ', '0');
        }
        int left = 0;
        int right = binary.length() - 1;
        while (left < right) {
            if (binary.charAt(left) != binary.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}