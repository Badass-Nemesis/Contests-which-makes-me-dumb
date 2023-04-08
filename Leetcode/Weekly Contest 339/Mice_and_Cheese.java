import java.util.*;

class Solution {
    public static int[] tempRew1;
    public static int[] tempRew2;

    public static class Pair implements Comparable<Pair> {
        int val;
        int index;

        Pair(int val, int index) {
            this.val = val;
            this.index = index;
        }

        public int compareTo(Pair other) {
            return (tempRew1[other.index] - tempRew2[other.index]) - (tempRew1[this.index] - tempRew2[this.index]);
        }
    }

    public int miceAndCheese(int[] reward1, int[] reward2, int k) {
        int[] visited = new int[reward1.length];
        Arrays.fill(visited, -1);

        tempRew1 = reward1;
        tempRew2 = reward2;

        Queue<Pair> q = new PriorityQueue<>();
        for (int i = 0; i < reward1.length; i++) {
            q.add(new Pair(reward1[i], i));
        }

        long count1 = 0;
        int tempK = k;
        while (tempK-- > 0) {
            Pair temp = q.poll();
            count1 += temp.val;
            visited[temp.index] = 1;
        }

        long count2 = 0;
        for (int i = 0; i < reward2.length; i++) {
            if (visited[i] == -1) {
                count2 += reward2[i];
            }
        }

        return (int) (count1 + count2);
    }
}