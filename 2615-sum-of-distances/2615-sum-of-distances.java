class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] ans = new long[n];
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }
        for (ArrayList<Integer> list : map.values()) {
            int m = list.size();
            long[] prefix = new long[m];
            prefix[0] = list.get(0);
            for (int i = 1; i < m; i++) {
                prefix[i] = prefix[i - 1] + list.get(i);
            }
            for (int i = 0; i < m; i++) {
                int index = list.get(i);
                long left = 0;
                if (i > 0) {
                    left = (long) i * index - prefix[i - 1];
                }
                long right = 0;
                if (i < m - 1) {
                    right = (prefix[m - 1] - prefix[i]) - (long) (m - i - 1) * index;
                }
                ans[index] = left + right;
            }
        }
        return ans;
    }
}