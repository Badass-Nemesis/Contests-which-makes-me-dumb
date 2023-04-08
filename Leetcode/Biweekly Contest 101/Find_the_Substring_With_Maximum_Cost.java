class Solution {
    public int maximumCostSubstring(String s, String chars, int[] vals) {
        long maxSum = 0;
        long currentSum = 0;

        int[] val = new int[26];
        for (int i = 0; i < 26; i++) {
            val[i] = i + 1;
        }

        for (int i = 0; i < chars.length(); i++) {
            int index = chars.charAt(i) - 'a';
            val[index] = vals[i];
        }

        for (int i = 0; i < s.length(); i++) {
            int temp = s.charAt(i) - 'a';
            currentSum += val[temp];
            if (currentSum < 0) {
                currentSum = 0;
            }
            maxSum = Math.max(maxSum, currentSum);
        }

        return (int) maxSum;
    }
}