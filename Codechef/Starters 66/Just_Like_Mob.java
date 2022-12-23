/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Just_Like_Mob {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner scn = new Scanner(System.in);
        int testCases = scn.nextInt();
        for (int i = 0; i < testCases; i++) {
            int n = scn.nextInt();
            int m = scn.nextInt();
            int k = scn.nextInt();
            int x = scn.nextInt();

            int perKyearDays = 0;
            for (int j = 0; j < k; j++) {
                if (j == k - 1) {
                    perKyearDays += (n + m);
                } else {
                    perKyearDays += n;
                }
            }

            // why tf is this giving me TLE?
            // while (x > 0) {
            // x -= perKyearDays;
            // }

            x = x % perKyearDays;
            if (x > 0) {
                x -= perKyearDays;
            }

            // wrong answer on abs(x) <= n + m, because wo pichle year mein chala jayega
            // lol I'm dumb
            if (Math.abs(x) < n + m) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scn.close();
        return;
    }
}
