import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Add_smallest_prime_factor {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int x = scn.nextInt();
            int y = scn.nextInt();

            if (x % 2 == 0) {
                y -= x;
                if (y % 2 == 0) {
                    System.out.println((y / 2));
                } else {
                    System.out.println((y / 2) + 1);
                }
            } else {
                if (x == 3 || x == 9) {
                    y -= (x + 3);
                } else if (x == 5) {
                    y -= (x + 5);
                } else if (x == 7) {
                    y -= (x + 7);
                }
                if (y <= 0) {
                    System.out.println(1);
                } else {
                    if (y % 2 == 0) {
                        System.out.println((y / 2) + 1);
                    } else {
                        System.out.println((y / 2) + 2);
                    }
                }
            }
        }
    }
}
