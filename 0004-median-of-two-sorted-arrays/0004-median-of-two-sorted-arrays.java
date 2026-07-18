class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] ans = new int[m + n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums1[i];
        }
        int k = 0;
        for (int j = n; j < m + n; j++) {
            ans[j] = nums2[k++];
        }
        Arrays.sort(ans);
        double d = 0;
        int total = n + m;
        int mid = total / 2;

        if (total % 2 == 0) {
            return (ans[mid] + ans[mid - 1]) / 2.0;
        } else {
            return ans[mid];
        }

    }
}