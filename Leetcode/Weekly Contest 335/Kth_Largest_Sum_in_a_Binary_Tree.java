import java.util.*;

class Solution {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        ArrayList<Long> sumArr = new ArrayList<>();

        while (queue.size() > 0) {
            int size = queue.size();
            long sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.remove();
                sum += temp.val;
                if (temp.right != null) {
                    queue.add(temp.right);
                }
                if (temp.left != null) {
                    queue.add(temp.left);
                }
            }
            sumArr.add(sum);
        }

        Collections.sort(sumArr);
        Collections.reverse(sumArr);

        if (sumArr.size() < k) {
            return -1;
        }
        return sumArr.get(k - 1);
    }
}