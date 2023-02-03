import java.util.*;

class Solution {
    public static ArrayList<Long> allNumbers(long A, long B) {
        ArrayList<Long> ans = new ArrayList<>();

        for (long i = A; i <= B; i += A) {
            if (B % i == 0) {
                ans.add(i);
            }
        }

        return ans;
    }
}