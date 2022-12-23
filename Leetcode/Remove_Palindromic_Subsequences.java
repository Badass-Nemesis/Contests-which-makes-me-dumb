public class Solution {
    public int removePalindromeSub(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if (ch1 != ch2) {
                return 2;
            } else {
                i++;
                j--;
            }
        }
        return 1;
    }
}