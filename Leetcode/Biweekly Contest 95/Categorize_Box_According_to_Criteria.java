class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean bulky = false;
        boolean heavy = false;
        double temp = width * 0.1 * height * 0.1 * length * 0.1;
        if (length >= 10000 || width >= 10000 || height >= 10000 || temp >= 1000000) {
            bulky = true;
        }

        if (mass >= 100) {
            heavy = true;
        }

        if (bulky && heavy) {
            return "Both";
        } else if (bulky == false && heavy == false) {
            return "Neither";
        } else if (bulky && heavy == false) {
            return "Bulky";
        } else {
            return "Heavy";
        }
    }
}
