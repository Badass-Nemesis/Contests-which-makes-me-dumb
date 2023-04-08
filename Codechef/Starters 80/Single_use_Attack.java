/* package codechef; // don't place package name! */

import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Single_use_Attack {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int h = scn.nextInt();
            int x = scn.nextInt();
            int y = scn.nextInt();

            int count = 1;
            h -= y;
            while (h > 0) {
                h -= x;
                count++;
            }
            System.out.println(count);
        }
    }
}
