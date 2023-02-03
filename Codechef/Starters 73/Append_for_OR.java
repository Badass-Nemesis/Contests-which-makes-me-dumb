/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    static void solve(Scanner scn) {
        int n = scn.nextInt();
        int y = scn.nextInt();
        int arrOR = scn.nextInt();
        for (int i = 1; i < n; i++) {
            int temp = scn.nextInt();
            arrOR = arrOR | temp;
        }

        int temp = y ^ arrOR;
        if ((arrOR | temp) == y) {
            System.out.println(temp);
        } else {
            System.out.println(-1);
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            solve(scn);
        }
    }
}
