import java.util.*;

class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> set = new HashSet<>();
        for (int num : banned) {
            set.add(num);
        }
        int temp = maxSum;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (set.contains(i) == false && temp - i >= 0) {
                temp -= i;
                count++;
            }
        }

        return count;
    }
}