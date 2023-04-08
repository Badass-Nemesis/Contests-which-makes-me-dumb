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
            int a = 100;
            int b = 200;
            int discountA = scn.nextInt();
            int discountB = scn.nextInt();
            if (a - ((a * discountA) / 100) == b - ((b * discountB) / 100)) {
                System.out.println("BOTH");
            } else if (a - ((a * discountA) / 100) < b - ((b * discountB) / 100)) {
                System.out.println("FIRST");
            } else {
                System.out.println("SECOND");
            }
        }
    }
}
