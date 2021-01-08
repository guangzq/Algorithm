package java;

public class Solution_209 {
    public int minSubArrayLen(int s, int[] nums) {
        int left = 0;
        int right = 0;
        int min = Integer.MAX_VALUE;
        int length = nums.length;
        if(length == 0) return 0;
        int sum = 0;
        while(right < length) {
            sum += nums[right];
            right++;
            while(sum >= s) {
                min = Math.min(right - left, min);
                sum-=nums[left];
                left++;
            }
        }
        return min = min == Integer.MAX_VALUE?0:min;
    }
}
