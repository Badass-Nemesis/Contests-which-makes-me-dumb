class Solution {
    public long coloredCells(int n) {
        long ans = 0;
        long temp = 2 * n - 3;
        for (int i = 0; i < n - 1; i++) {
            ans += 2 * temp;
            temp -= 2;
        }

        ans += (2 * n - 1);

        return ans;
    }
}