/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Binary_Battles {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner scn = new Scanner(System.in);
        int testCases = scn.nextInt();
        for (int i = 0; i < testCases; i++) {
            int n = scn.nextInt();
            int a = scn.nextInt();
            int b = scn.nextInt();

            int pow = 0;
            while (n / 2 != 0) {
                pow++;
                n = n / 2;
            }
            // System.out.println(pow);

            System.out.println(a * pow + b * (pow - 1));
        }

        scn.close();
        return;
    }
}
