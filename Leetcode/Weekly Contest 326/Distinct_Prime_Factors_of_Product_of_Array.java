import java.util.*;

class Solution {
    static boolean[] arr;
    static ArrayList<Integer> primeArr;

    public static void seive() {
        Arrays.fill(arr, true);
        for (int i = 2; i * i <= 1001; i++) {
            if (arr[i] == true) {
                primeArr.add(i);
                for (int j = i + i; j < 1001; j += i) {
                    arr[j] = false;
                }
            }
        }
    }

    public int distinctPrimeFactors(int[] nums) {
        arr = new boolean[1001];
        primeArr = new ArrayList<>();
        seive();

        // int count = 0;

        Set<Integer> set = new HashSet<>();
        // int index = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 2; j < 1001; j++) {
                if (arr[j] == true && nums[i] % j == 0) {
                    set.add(j);
                }
            }
        }

        return set.size();
    }
}