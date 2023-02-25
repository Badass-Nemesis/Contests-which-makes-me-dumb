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
            int x = scn.nextInt();
            if (x > (n + 1)) {
                System.out.print(-1);
            } else if (x <= -(n)) {
                System.out.print(-1);
            } else if (x == 1) {
                for (int i = 0; i < n; i++) {
                    System.out.print("*");
                }
            } else if (x == 0) {
                if (n < 1) {
                    System.out.print(-1);
                } else {
                    System.out.print("-");
                    for (int i = 1; i < n; i++) {
                        System.out.print("*");
                    }
                }
            } else {
                if (x > 0) {
                    for (int i = 0; i < x - 1; i++) {
                        System.out.print("+");
                    }
                    for (int i = x - 1; i < n; i++) {
                        System.out.print("*");
                    }
                }

                if (x < 0) {
                    for (int i = 0; i < Math.abs(x) + 1; i++) {
                        System.out.print("-");
                    }
                    for (int i = Math.abs(x) + 1; i < n; i++) {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}
