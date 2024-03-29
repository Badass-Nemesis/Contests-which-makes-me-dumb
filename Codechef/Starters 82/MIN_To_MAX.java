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
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }

            Arrays.sort(arr);
            int min = arr[0];
            int count = n;

            for (int i = 0; i < n; i++) {
                if (arr[i] == min) {
                    count--;
                }
            }

            System.out.println(count);
        }
    }
}
