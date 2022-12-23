/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Palindrome_by_splitting {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner scn = new Scanner(System.in);
        int test_cases = scn.nextInt();
        while (test_cases-- > 0) {
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }

            int count = 0;
            int leftPointer = 0;
            int rightPointer = n - 1;
            while (leftPointer < rightPointer) {
                if (arr[leftPointer] == arr[rightPointer]) {
                    leftPointer++;
                    rightPointer--;
                } else if (arr[leftPointer] > arr[rightPointer]) {
                    arr[leftPointer] = arr[leftPointer] - arr[rightPointer];
                    rightPointer--;
                    count++;
                } else {
                    arr[rightPointer] = arr[rightPointer] - arr[leftPointer];
                    leftPointer++;
                    count++;
                }
            }

            System.out.println(count);
        }

        scn.close();
    }
}
