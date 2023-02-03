/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Find_an_Integer {
    static void solve(Scanner scn) {
        int x = scn.nextInt();
        int y = scn.nextInt();

        // THIS CODE IS GIVING HALF AC AND HALF TLE
        long possibleAns = (x * y) - x - y;
        while (true) {
            if (possibleAns >= 0) {
                System.out.println(possibleAns);
                return;
            } else {
                possibleAns += (x * y);
            }
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
