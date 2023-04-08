import java.util.*;

class Solution {
    public int splitNum(int num) {
        ArrayList<Integer> arr = new ArrayList<>();
        while (num > 0) {
            arr.add(num % 10);
            num /= 10;
        }

        Collections.sort(arr);
        Collections.reverse(arr);
        long tens = 1;
        long num1 = 0;
        long num2 = 0;
        for (int i = 0; i < arr.size(); i += 2) {
            num1 += arr.get(i) * tens;
            if (i + 1 < arr.size()) {
                num2 += arr.get(i + 1) * tens;
            }
            tens *= 10;
        }
        return (int) (num1 + num2);
    }
}