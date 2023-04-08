import java.io.*;
import java.util.*;

class Prefix_Permutation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();

            if (n % 2 != 0) {
                System.out.println(-1);
                continue;
            }

            for (int i = 1; i <= n; i += 2) {
                System.out.print((i + 1) + " " + i + " ");
            }

            System.out.println();
        }
    }
}
