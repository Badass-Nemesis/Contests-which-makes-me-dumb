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
            int x = scn.nextInt();
            int y = scn.nextInt();
            if (15 * x < 2 * y) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
