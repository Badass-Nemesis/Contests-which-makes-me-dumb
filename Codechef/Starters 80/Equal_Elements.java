import java.util.*;
import java.io.*;

class Equal_Elements {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }
            HashMap<Integer, Integer> hm = new HashMap<>();
            for (int i = 0; i < n; i++) {
                if (hm.containsKey(arr[i]) == true) {
                    hm.put(arr[i], hm.get(arr[i]) + 1);
                } else {
                    hm.put(arr[i], 1);
                }
            }
            int temp = Integer.MIN_VALUE;
            for (Integer val : hm.keySet()) {
                if (hm.get(val) > temp) {
                    temp = hm.get(val);
                }
            }

            System.out.println(n - temp);
        }
    }
}
