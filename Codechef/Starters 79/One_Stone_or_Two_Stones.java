import java.util.*;
import java.lang.*;
import java.io.*;

class One_Stone_or_Two_Stones {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int x = scn.nextInt();
            int y = scn.nextInt();

            if (x == y) {
                if (x % 2 != 0) {
                    System.out.println("CHEF");
                } else {
                    System.out.println("CHEFINA");
                }
            } else if (Math.abs(x - y) >= 2) {
                if (x < y) {
                    System.out.println("CHEFINA");
                } else {
                    System.out.println("CHEF");
                }
            } else if ((x + y) % 4 == 1) {
                System.out.println("CHEFINA");
            } else {
                System.out.println("CHEF");
            }
        }
    }
}
