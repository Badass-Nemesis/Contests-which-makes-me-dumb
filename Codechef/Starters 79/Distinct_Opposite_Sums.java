import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Distinct_Opposite_Sums {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            for (int i = 1; i <= n / 2; i++) {
                System.out.print(i + " " + (n - i + 1) + " ");
            }

            System.out.println();
        }
    }
}
