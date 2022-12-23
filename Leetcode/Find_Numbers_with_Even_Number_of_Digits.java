import java.util.*;

public class Find_Numbers_with_Even_Number_of_Digits {
    public static int digitcount(int n) {
        int d = 0;
        for (int i = n; i != 0; d++) {
            i /= 10;
        }
        return d;
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (digitcount(nums[i]) % 2 == 0)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] Array = { 12, 345, 2, 6, 7896 };
        System.out.println(findNumbers(Array));
    }
}