import java.util.*;

class Solution {
    public long beautifulSubarrays(int[] nums) {
        HashMap<Long, Long> hm = new HashMap<>();
        hm.put((long) 0, (long) 1);
        long count = 0;
        long currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum ^= nums[i];
            if (hm.containsKey(currentSum ^ 0) == true && hm.get(currentSum ^ 0) > 0) {
                count += hm.get(currentSum ^ 0);
            }
            if (hm.containsKey(currentSum) == true) {
                hm.put(currentSum, hm.get(currentSum) + 1);
            } else {
                hm.put(currentSum, (long) 1);
            }
        }

        return count;
    }
}