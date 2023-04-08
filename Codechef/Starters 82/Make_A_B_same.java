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
            int[] arrA = new int[n];
            int oneCount = 0;
            for (int i = 0; i < n; i++) {
                arrA[i] = scn.nextInt();
                if (arrA[i] == 1) {
                    oneCount++;
                }
            }

            int oneCount2 = 0;
            int[] arrB = new int[n];
            for (int i = 0; i < n; i++) {
                arrB[i] = scn.nextInt();
                if (arrB[i] == 1) {
                    oneCount2++;
                }
            }

            boolean fuqed = false;
            if (oneCount == 0 && oneCount2 > 0) {
                System.out.println("NO");
                fuqed = true;
            } else if (arrA[0] != arrB[0] || arrA[n - 1] != arrB[n - 1]) {
                System.out.println("NO");
                fuqed = true;
            } else {
                for (int i = 0; i < n; i++) {
                    if (arrA[i] == 1 && arrB[i] == 0) {
                        System.out.println("NO");
                        fuqed = true;
                        break;
                    }
                }
            }

            if (fuqed == false) {
                System.out.println("YES");
            }

        }
    }
}
