import java.util.*;

class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        int min = nums1[0];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        Arrays.sort(nums2);
        int min2 = nums2[0];

        int temp = Integer.MAX_VALUE;
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i]) == true) {
                temp = Math.min(temp, nums2[i]);
            }
        }

        return Math.min(10 * min + min2, Math.min(10 * min2 + min, temp));
    }
}