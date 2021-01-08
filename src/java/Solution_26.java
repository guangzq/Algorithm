package java;

public class Solution_26 {
    public int removeDuplicates(int[] nums) {
        int start =0;
        int end = 1;
        while(end < nums.length) {
            if(nums[start] != nums[end]) {
                nums[start+1]=nums[end];
                start++;
            }
            end++;
        }
        return start+1;
    }
}
