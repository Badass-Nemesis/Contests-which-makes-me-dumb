/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void solve(Scanner scn) {
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        for (int i = 1; i < 100; i++) {
            if (a % i != 0 && b % i != 0 && c % i != 0) {
                System.out.println(i);
                return;
            }
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        while (n-- > 0) {
            solve(scn);
        }
    }
}
