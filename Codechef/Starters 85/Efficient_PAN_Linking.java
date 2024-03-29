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
            String s = scn.next();
            int num = 0;
            int rem = 0;
            for (int i = 0; i < s.length(); i++) {
                num = rem * 10 + (s.charAt(i) - '0');
                rem = num % 20;
            }

            System.out.println(rem);
        }
    }
}
