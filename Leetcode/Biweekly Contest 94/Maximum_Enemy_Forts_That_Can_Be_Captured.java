import java.util.ArrayList;

class Solution {
    public int captureForts(int[] forts) {
        ArrayList<Integer> oneWalaIndex = new ArrayList<>();
        ArrayList<Integer> minusOneWalaIndex = new ArrayList<>();
        for (int i = 0; i < forts.length; i++) {
            if (forts[i] == 1) {
                oneWalaIndex.add(i);
            } else if (forts[i] == -1) {
                minusOneWalaIndex.add(i);
            }
        }

        int ans = 0;
        for (Integer oneVal : oneWalaIndex) {
            for (Integer minusOneVal : minusOneWalaIndex) {
                int temp = Math.abs(oneVal - minusOneVal) - 1;
                if (temp > 0) {
                    ans = Math.max(ans, temp);
                }
            }
        }

        return ans;
    }
}