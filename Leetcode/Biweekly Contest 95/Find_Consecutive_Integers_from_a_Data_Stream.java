import java.util.HashMap;

class DataStream {

    static int sastaValue;
    static int sastaK;
    static HashMap<Integer, Integer> hm;

    public DataStream(int value, int k) {
        hm = new HashMap<>();
        sastaValue = value;
        sastaK = k;
    }

    public boolean consec(int num) {
        if (num == sastaValue && hm.containsKey(num)) {
            int temp = hm.get(num) + 1;
            hm.put(num, temp);
            if (temp >= sastaK && num == sastaValue) {
                return true;
            } else {
                return false;
            }
        } else {
            hm.clear();
            hm.put(num, 1);
            return false;
        }
    }
}

/**
 * Your DataStream object will be instantiated and called as such:
 * DataStream obj = new DataStream(value, k);
 * boolean param_1 = obj.consec(num);
 */