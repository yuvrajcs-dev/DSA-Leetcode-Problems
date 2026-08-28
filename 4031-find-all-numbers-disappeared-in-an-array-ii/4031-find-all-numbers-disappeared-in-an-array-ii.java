class Solution {
    public List<List<Integer>> findDisappearedNumbers(
            int[] nums, int lower, int upper) {

        HashSet<Integer> set = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();

        for (int num : nums) {
            set.add(num);
        }

        int start = -1;

        for (int i = lower; i <= upper; i++) {

            if (!set.contains(i)) {

                if (start == -1) {
                    start = i;
                }

            } else {
                if (start != -1) {
                    ans.add(Arrays.asList(start, i - 1));
                    start = -1;
                }
            }
        }
        if (start != -1) {
            ans.add(Arrays.asList(start, upper));
        }

        return ans;
    }
}