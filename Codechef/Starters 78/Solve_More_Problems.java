import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Solve_More_Problems {
    public static class Pair implements Comparable<Pair> {
        int solve;
        int breake;

        Pair(int solve, int breake) {
            this.solve = solve;
            this.breake = breake;
        }

        public int compareTo(Pair other) {
            return (this.breake + this.solve) - (other.solve + other.breake);
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int k = scn.nextInt();

            int[] A = new int[n];
            int[] B = new int[n];
            for (int i = 0; i < n; i++) {
                A[i] = scn.nextInt();
            }
            for (int i = 0; i < n; i++) {
                B[i] = scn.nextInt();
            }

            PriorityQueue<Pair> pq = new PriorityQueue<>();
            for (int i = 0; i < n; i++) {
                pq.add(new Pair(A[i], B[i]));
            }

            int count = 0;
            while (pq.size() != 0) {
                if (k <= 0) {
                    break;
                }

                Pair curr = pq.remove();
                // System.out.println(curr.solve + " " + curr.breake);
                if (pq.size() > 0 && curr.solve < pq.peek().solve) {
                    if (curr.solve <= k) {
                        k -= curr.solve;
                        k -= curr.breake;
                        count++;
                    }
                } else if (pq.size() > 0 && curr.solve > pq.peek().solve) {
                    Pair secondCurr = pq.remove();
                    pq.add(curr);
                    if (secondCurr.solve <= k) {
                        k -= secondCurr.solve;
                        k -= secondCurr.breake;
                        count++;
                    }
                } else {
                    if (curr.solve <= k) {
                        k -= curr.solve;
                        k -= curr.breake;
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }
}
