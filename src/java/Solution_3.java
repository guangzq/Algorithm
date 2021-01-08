package java;

import java.util.HashMap;
import java.util.Map;

public class Solution_3 {
    /**
     * 3. 无重复字符的最长子串
     * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        Map<Character, Integer> map = new HashMap<>();
        int start = 0,  ans =0;
        for (int end=0;end<s.length();end++) {
            char aChar = s.charAt(end);
            if (map.containsKey(aChar)) {
                start = Math.max(start, map.get(aChar));
            }
            map.put(aChar, end + 1);
            ans = Math.max(ans, end - start + 1);
        }
        return ans;
    }
}
