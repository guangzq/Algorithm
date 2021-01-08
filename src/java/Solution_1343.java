package java;

public class Solution_1343 {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        int count = 0;
        for(int i=0;i<k;i++) {
            sum+=arr[i];
        }
        int sumTarget = threshold*k;
        int result = sum - sumTarget;
        if(result >= 0) {
            count++;
        }
        int pos=k;
        for(int i=0;i<arr.length-k;i++) {
            result = result + arr[pos]-arr[i];
            if(result >= 0) {
                count++;
            }
            pos++;
        }
        return count;
    }
}
