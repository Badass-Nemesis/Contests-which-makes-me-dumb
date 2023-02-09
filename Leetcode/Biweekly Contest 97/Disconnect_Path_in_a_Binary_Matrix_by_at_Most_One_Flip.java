import java.util.*;

// wrong code
class Solution {
    public boolean isPossibleToCutPath(int[][] grid) {
        int[] countArr = new int[grid.length];
        for (int i = 0; i < grid.length; i++) {
            int count = 0;
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    count++;
                }
            }
            countArr[i] = count;
        }

        for (int i = 0; i < countArr.length - 1; i++) {
            if (countArr[i] >= grid[0].length - 1) {
                return true;
            } else if (countArr[i] + countArr[i + 1] >= grid[0].length - 1) {
                return true;
            }
        }
        if (countArr[countArr.length - 1] >= grid[0].length - 1) {
            return true;
        }

        return false;
    }
}