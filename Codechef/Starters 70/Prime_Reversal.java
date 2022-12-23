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
            String first = scn.next();
            String second = scn.next();

            int countOnesFirst = 0;
            int countZeroesFirst = 0;
            int countOnesSecond = 0;
            int countZeroesSecond = 0;
            for (int i = 0; i < n; i++) {
                if (first.charAt(i) == '1') {
                    countOnesFirst++;
                } else if (first.charAt(i) == '0') {
                    countZeroesFirst++;
                }

                if (second.charAt(i) == '1') {
                    countOnesSecond++;
                } else if (second.charAt(i) == '0') {
                    countZeroesSecond++;
                }
            }

            if (countOnesFirst == countOnesSecond && countZeroesFirst == countZeroesSecond) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
