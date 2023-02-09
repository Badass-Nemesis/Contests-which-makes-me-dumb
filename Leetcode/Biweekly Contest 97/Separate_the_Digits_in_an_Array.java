import java.util.*;

class Solution {
    public int[] separateDigits(int[] nums) {
        String temp = Arrays.toString(nums);
        // System.out.println(temp); // debug
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < temp.length(); i++) {
            char ch = temp.charAt(i);
            if (ch >= '0' && ch <= '9') {
                ans.add(ch - '0');
            }
        }

        int[] ans2 = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            ans2[i] = ans.get(i);
        }

        return ans2;
    }
}