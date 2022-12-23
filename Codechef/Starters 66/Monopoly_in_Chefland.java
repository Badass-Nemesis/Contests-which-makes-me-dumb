/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Monopoly_in_Chefland {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner scn = new Scanner(System.in);
        int testCases = scn.nextInt();
        for (int i = 0; i < testCases; i++) {
            int[] arr = new int[3];
            int sum = 0;
            int max = 0;
            for (int j = 0; j < 3; j++) {
                arr[j] = scn.nextInt();
                sum += arr[j];
                if (arr[j] > max) {
                    max = arr[j];
                }

            }
            if (max > sum - max) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        scn.close();
        return;
    }
}
