/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Frequency_Array_Retrieval {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        /*
         * 
         * THIS IS WRONG CODE BTW!!!
         * 
         * (I got WA and TLE both in whole testcases)
         * 
         */
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int[] arr = new int[n];
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
                set.add(arr[i]);
            }

            int totalCount = 0;
            for (Integer val : set) {
                totalCount += val;
            }

            if (totalCount > n) {
                System.out.println(-1);
            } else {

                Arrays.sort(arr);

                int[] freqIndexSum = new int[100001];
                Arrays.fill(freqIndexSum, 0);
                // first putting/summing all up
                for (int i = 0; i < n; i++) {
                    freqIndexSum[arr[i]]++;
                }
                // now dividing
                for (int i = 1; i < freqIndexSum.length; i++) {
                    if (freqIndexSum[i] > 0) {
                        freqIndexSum[i] = (freqIndexSum[i]) / i;
                        // System.out.println(i + " " + freqIndexSum[i]); // debug
                    }
                }

                int index = 1;
                for (int i = 1; i < freqIndexSum.length; i++) {
                    if (freqIndexSum[i] > 0) {
                        int temp = freqIndexSum[i];
                        for (int j = 0; j < temp; j++) {
                            for (int k = 0; k < i; k++) {
                                System.out.print(index + " ");
                            }
                            index++;
                        }
                    }
                }

                System.out.println();
            }
        }
    }
}
