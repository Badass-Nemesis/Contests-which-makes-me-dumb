/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Squats {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner scn = new Scanner(System.in);
        int testCase = scn.nextInt();
        for (int i = 0; i < testCase; i++) {
            int set = scn.nextInt();
            System.out.println(set * 15);
        }
        scn.close();
        return;
    }
}
