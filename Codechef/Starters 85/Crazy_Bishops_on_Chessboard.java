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
            long n = scn.nextLong();
            if (n == 1 || n == 2) {
                System.out.println(0);
            } else if (n % 2 == 0) {
                long count = 3 + 3 * (n - 4) / 2;
                System.out.println(count);
            } else {
                long count = 2 + 3 * (n - 3) / 2;
                System.out.println(count);
            }
        }
    }
}
