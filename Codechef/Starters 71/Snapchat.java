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
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scn.nextInt();
            }

            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = scn.nextInt();
            }

            int count = 0;
            int tempCount = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] == 0 || b[i] == 0) {
                    count = Math.max(tempCount, count);
                    tempCount = 0;
                } else {
                    tempCount++;
                }
            }

            count = Math.max(count, tempCount);

            System.out.println(count);
        }
    }
}
