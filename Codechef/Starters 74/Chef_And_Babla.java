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
            int[] arr = new int[n];
            long positiveLow = (long) 10e9;
            long negativeHigh = -(long) 10e9;
            boolean containsZero = false;
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();

                if (arr[i] > 0) {
                    if (positiveLow > arr[i]) {
                        positiveLow = arr[i];
                    }
                } else {
                    if (negativeHigh < arr[i]) {
                        negativeHigh = arr[i];
                    }
                }

                if (arr[i] == 0) {
                    containsZero = true;
                }
            }

            if (containsZero == true) {
                System.out.println(-1);
            } else {
                int res = Math.min((int) positiveLow, (int) (-1 * negativeHigh));
                System.out.println(res - 1);
            }
        }
    }
}
