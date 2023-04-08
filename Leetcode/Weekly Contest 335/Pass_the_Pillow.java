class Solution {
    public int passThePillow(int n, int time) {
        if (time < n) {
            return time + 1;
        } else {
            int temp1 = time % (n - 1);
            int temp2 = time / (n - 1);
            if (temp2 % 2 != 0) {
                return n - temp1;
            } else {
                return temp1 + 1;
            }
        }
    }
}