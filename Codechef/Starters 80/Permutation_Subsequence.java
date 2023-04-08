import java.util.*;
import java.io.*;

class Permutation_Subsequence {
    static long mod = 1000000007;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextLong();
            }

            HashMap<Long, Long> hm = new HashMap<>();
            long temp = 0;
            for (int i = 0; i < n; i++) {
                if (hm.containsKey(arr[i]) == true) {
                    hm.put(arr[i], hm.get(arr[i]) + 1);

                    temp = (temp + hm.get(arr[i] - 1)) % mod;
                } else if (arr[i] > 1 && hm.containsKey(arr[i] - 1) == true) {
                    hm.put(arr[i], (long) 1);

                    temp = (temp + hm.get(arr[i] - 1)) % mod;
                } else if (arr[i] == 1) {
                    hm.put(arr[i], (long) 1);
                    temp++;
                }
            }

            if (hm.containsKey((long) 1) == false || hm.get((long) 1) == 0) {
                System.out.println(-1);
                continue;
            }

            long num = 1;
            long count = 1;
            while (hm.containsKey(num) == true && hm.get(num) > 0) {
                count *= (hm.get(num)) % mod;
                num++;
            }

            num--;

            if ((num * count) % mod == 1) {
                System.out.println(1);
            } else {
                System.out.println((num * count) % mod - 1);
            }

            System.out.println(temp);
        }
    }
}
