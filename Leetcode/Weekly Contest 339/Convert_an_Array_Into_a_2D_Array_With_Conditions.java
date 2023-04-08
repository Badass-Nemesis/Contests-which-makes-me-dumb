import java.util.*;

class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int[] visited = new int[nums.length];
        Arrays.fill(visited, 0);
        int visCount = 0;

        List<List<Integer>> ans = new ArrayList<>();
        while (visCount < nums.length) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if (temp.contains(nums[i]) == false && visited[i] == 0) {
                    temp.add(nums[i]);
                    visited[i] = 1;
                    visCount++;
                }
            }
            ans.add(temp);

        }
        return ans;
    }
}