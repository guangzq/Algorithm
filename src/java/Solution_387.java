package java;

import java.util.HashMap;

public class Solution_387 {
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        int length = chars.length;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < length; i++) {
            char char1 = s.charAt(i);
            Integer count = hashMap.get(char1);
            if (count == null) {
                count = 0;
            }
            hashMap.put(char1, ++count);
        }
        for (int i = 0; i < length; i++) {
            Integer count = hashMap.get(chars[i]);
            if (count != null && count == 1) {
                return i;
            }
        }
        return -1;
    }
}
