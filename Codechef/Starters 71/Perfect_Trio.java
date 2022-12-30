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
            int a = scn.nextInt();
            int b = scn.nextInt();
            int c = scn.nextInt();

            if (a == b + c) {
                System.out.println("YES");
            } else if (c == a + b) {
                System.out.println("YES");
            } else if (b == a + c) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}