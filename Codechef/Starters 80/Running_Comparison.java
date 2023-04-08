import java.util.*;
import java.lang.*;
import java.io.*;

class Running_Comparison {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int[] aliceArr = new int[n];
            int[] bobArr = new int[n];
            int count = 0;
            for (int i = 0; i < n; i++) {
                aliceArr[i] = scn.nextInt();
            }
            for (int i = 0; i < n; i++) {
                bobArr[i] = scn.nextInt();

                if (bobArr[i] > aliceArr[i]) {
                    if (bobArr[i] <= 2 * aliceArr[i]) {
                        count++;
                    }
                } else if (bobArr[i] < aliceArr[i]) {
                    if (2 * bobArr[i] >= aliceArr[i]) {
                        count++;
                    }
                } else {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
