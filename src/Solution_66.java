public class Solution_66 {
    public static void main(String[] args) {
        System.out.println(0%10);
    }
    public int[] plusOne(int[] digits) {
        if(digits == null || digits.length == 0) return null;
        int length = digits.length;
        for(int i=length-1;i>=0;i--) {
            digits[i]++;
            digits[i]%=10;
            if(digits[i]!=0) {
                return digits;
            }
        }
        digits = new int[length+1];
        digits[0]=1;
        return digits;
    }
}
