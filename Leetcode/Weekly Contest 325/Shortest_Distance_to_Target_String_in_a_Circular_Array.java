class Solution {
    public int closetTarget(String[] words, String target, int startIndex) {
        int tempStart = startIndex;
        if (startIndex != 0) {
            tempStart--;
        }
        boolean found = false;
        int indexFound = Integer.MAX_VALUE;
        for (int i = tempStart; i < words.length; i++) {
            if (words[i].equals(target)) {
                if (i >= ((words.length + 1) / 2)) {
                    indexFound = Math.min(indexFound, words.length - i);
                } else {
                    indexFound = Math.min(indexFound, i) + 1;
                }
                found = true;
            }
        }

        for (int i = 0; i < tempStart; i++) {
            if (words[i].equals(target)) {
                if (i >= ((words.length + 1) / 2)) {
                    indexFound = Math.min(indexFound, words.length - i);
                } else {
                    indexFound = Math.min(indexFound, i) + 1;
                }
                found = true;
            }
        }

        return found == false ? -1 : indexFound;
    }
}