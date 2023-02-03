class Solution {
    public int differenceOfSum(int[] nums) {
        int temp1 = 0;
        int temp2 = 0;
        for (int i = 0; i < nums.length; i++) {
            temp1 += nums[i];
            int temp = 0;
            while (nums[i] > 0) {
                temp += nums[i] % 10;
                nums[i] /= 10;
            }
            temp2 += temp;
        }
        return Math.abs(temp1 - temp2);
    }
}