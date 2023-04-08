import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public static int gcd(long a, long b) {
        if (b == 0) {
            return (int) a;
        }
        return gcd(b, a % b);
    }

    public int findValidSplit(int[] nums) {
        // ArrayList<Long> prefixArr = new ArrayList<>();
        // ArrayList<Long> suffixArr = new ArrayList<>();

        // for (int i = 0; i < nums.length - 1; i++) {
        // if (i == 0) {
        // prefixArr.add((long) nums[i]);
        // } else {
        // prefixArr.add(prefixArr.get(i - 1) * nums[i]);
        // }
        // }

        // for (int i = nums.length - 1; i >= 1; i--) {
        // if (i == nums.length - 1) {
        // suffixArr.add((long) nums[i]);
        // } else {
        // suffixArr.add(suffixArr.get(suffixArr.size() - 1) * nums[i]);
        // }
        // }
        // Collections.reverse(suffixArr);

        // for (int i = 0; i < prefixArr.size(); i++) {
        // if (gcd(prefixArr.get(i), suffixArr.get(i)) == 1) {
        // return i;
        // }
        // }
        // return -1;

        int pointer = nums.length - 1;
        long prod = 1;
        while (nums[pointer] % 2 != 0) {
            pointer--;
            prod*=nums[pointer];
        }

        if (pointer == 0) {
            return -1;
        } else {
            return pointer;
        }
    }
}