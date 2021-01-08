package java;

public class Solution_27 {
    public int removeElement(int[] nums, int val) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int ans = 0;
        for(int num: nums) {
            if(num != val) {
                nums[ans++] = num;
            }
        }
        return ans;
    }
}
