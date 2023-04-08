class Solution {
    public int distMoney(int money, int children) {
        if (money < children) {
            return -1;
        }

        int count = 0;
        money -= children;
        count += money / 7;
        if (money % 7 == 3 && children - count == 1) {
            count--;
        }

        return count;
    }
}