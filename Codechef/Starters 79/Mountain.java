import java.util.*;
import java.lang.*;
import java.io.*;

class Mountain {
    public static int upper_bound(int arr[], int key) {
        int index = Arrays.binarySearch(arr, key);
        int n = arr.length;

        if (index < 0) {
            int upperBound = Math.abs(index) - 1;
            if (upperBound < n) {
                return upperBound;
            } else {
                return -1;
            }
        } else {
            while (index < n) {
                if (arr[index] == key) {
                    index++;
                } else {
                    return index;
                }
            }

            if (index == n) {
                return n - 1;
            }
            return -1;
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int q = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (i + 1) * m;
        }

        for (int i = 1; i < n; i++) {
            arr[i] += arr[i - 1];
        }

        // System.out.println(arr[n - 1] + " here"); // debug

        while (q-- > 0) {
            int queryNum = scn.nextInt();
            int index = upper_bound(arr, queryNum);
            // System.out.println(index + " index"); // debug
            if (index == -1 || queryNum > arr[n - 1]) {
                System.out.print(-1);
            } else if (arr[index] == queryNum) {
                System.out.println(1 + " " + (index + 1));
                for (int i = 0; i <= index; i++) {
                    System.out.print(m + " ");
                }
            } else if (index == 0) {
                System.out.println(1 + " " + 1);
                System.out.print(queryNum);
            } else {
                int temp = arr[index] - queryNum;
                int temp2 = temp % (index + 1);
                int temp3 = temp / (index + 1);

                System.out.println(1 + " " + (index + 1));
                // System.out.println(temp + " " + temp2 + " " + temp3 + " debug"); // debug
                for (int i = 0; i <= index; i++) {
                    if (i == index) {
                        System.out.print((m - temp3) + " ");
                    } else if ((i + 1) == temp2) {
                        System.out.print((m - 1) + " ");
                    } else {
                        System.out.print(m + " ");
                    }
                }
            }

            System.out.println();
        }
    }
}
