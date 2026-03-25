class Solution {
    public int[] plusOne(int[] digits) {
        for(int ind = digits.length-1;ind >= 0;ind--){
            if(digits[ind] < 9){
                digits[ind]++;
                return digits;
            }
            digits[ind] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
