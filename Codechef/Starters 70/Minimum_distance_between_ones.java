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
            String s = scn.next();
            int previous = -1;
            boolean flag = false;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    if (previous != -1 && (previous - i) % 2 != 0) {
                        System.out.println(1);
                        flag = true;
                        break;
                    }
                    previous = i;
                }
            }

            if (flag == false) {
                System.out.println(2);
            }
        }
    }
}
