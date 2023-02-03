import java.util.*;

class Solution {
    public static long gcd(long A, long B) {
        if (B == 0) {
            return A;
        }
        return gcd(B, A % B);
    }

    public static int longestSubarray(int A, int B) {
        long count = A * B;
        count = count / gcd(A, B);

        return (int) count;
    }
}