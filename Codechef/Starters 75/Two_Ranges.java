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
            int d = scn.nextInt();

            Set<Integer> set = new HashSet<>();
            for (int i = a; i <= b; i++) {
                set.add(i);
            }

            for (int i = c; i <= d; i++) {
                set.add(i);
            }

            System.out.println(set.size());
        }
    }
}
