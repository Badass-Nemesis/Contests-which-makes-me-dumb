/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        while (n-- > 0) {
            int t = scn.nextInt();
            if (t < 4) {
                System.out.println("MILD");
            } else if (t >= 4 && t < 7) {
                System.out.println("MEDIUM");
            } else {
                System.out.println("HOT");
            }
        }
    }
}
