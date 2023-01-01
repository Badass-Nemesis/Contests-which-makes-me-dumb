class Solution {
    public int minimumPartition(String s, int k) {
        // String kWala = k + "";
        String str = "";
        int count = 0;
        // Note- don't use integer, use long
        for (int i = 0; i < s.length(); i++) {
            str += s.charAt(i);
            if (Long.parseLong(str) > k) {
                str = ""; // resetting the string when it goes beyond
                str += s.charAt(i); // re-adding the single digit
                // new we have to check if the single digit is causing the previous if statement
                // to activate to not (i.e. is this single digit making me loose the
                // continuation of my sub-string)
                if (Long.parseLong(str) > k) {
                    // if the single digit is the reason, return immediately
                    return -1;
                } else {
                    count++;
                }
            }
        }

        return count + 1; // because we couldn't increment for the last one in the above if block
    }
}