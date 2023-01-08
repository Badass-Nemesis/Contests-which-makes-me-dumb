/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    static boolean isPrime(long n) {
        if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        }

        for (long i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void solve(Scanner scn) {
        long n = scn.nextLong();

        if (isPrime(n) == true) {
            System.out.println(-1);
            return;
        }

        for (long i = 2; i < n; i++) {
            if (n % i == 0 && i != (n / i)) {
                System.out.println(1 + " " + i + " " + n / i);
                return;
            }
        }

        System.out.println(-1);
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        while (n-- > 0) {
            solve(scn);
        }
    }
}
