class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int countZero = 0;
        int countOne = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) - '0' == 0) {
                if (countOne > 0) {
                    countZero = 0;
                    countOne = 0;
                }
                countZero++;
            } else if (countZero > countOne && s.charAt(i) - '0' == 1) {
                countOne++;
                max = Math.max(2 * countOne, max);

                if (countOne == countZero) {
                    countOne = 0;
                    countZero = 0;
                }
            }
        }

        if (max == Integer.MIN_VALUE) {
            return 0;
        }
        return max;
    }
}