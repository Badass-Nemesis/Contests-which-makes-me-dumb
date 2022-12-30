/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            HashMap<Integer, Integer> hm = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int temp = scn.nextInt();
                if (hm.containsKey(temp)) {
                    hm.put(temp, hm.get(temp) + 1);
                } else {
                    hm.put(temp, 1);
                }
            }

            boolean flag = false;
            for (Integer key : hm.keySet()) {
                int tempFreq = hm.get(key);
                if (tempFreq % 2 != 0) {
                    System.out.println("NO");
                    flag = true;
                    break;
                }
            }

            if (flag == false) {
                System.out.println("YES");
            }
        }
    }
}
