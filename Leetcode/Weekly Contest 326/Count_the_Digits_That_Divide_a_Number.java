import java.util.HashMap;

class Solution {
    public int countDigits(int num) {
        HashMap<Character, Integer> hm = new HashMap<>();
        String s = num + "";
        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
            } else {
                hm.put(s.charAt(i), 1);
                // System.out.println(s.charAt(i) + " " + hm.get(s.charAt(i))); // debug
            }
        }

        int ans = 0;
        for (int i = 1; i <= 9; i++) {
            char ch = (char) (i + '0');
            // System.out.println(ch); // debug
            if (num % i == 0) {
                if (hm.containsKey(ch)) {
                    ans += hm.get(ch);
                }
            }
        }
        return ans;
    }
}