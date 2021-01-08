package java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Solution_349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) return null;
        HashSet<Integer> hashSet = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        for (int i=0;i<nums1.length;i++) {
            hashSet.add(nums1[i]);
        }
        int index=0;
        for (int i=0;i<nums2.length;i++) {
            if (hashSet.contains(nums2[i])) {
                result.add(nums2[i]);
            }
        }
        int[] ints = new int[result.size()];
        Iterator<Integer> iterator = result.iterator();
        while (iterator.hasNext()) {
            ints[index++] = iterator.next();
        }
        return ints;
    }
}
