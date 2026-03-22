class Solution {
    public boolean isPowerOfThree(int n) {
        //System.out.print((int) Math.pow(3,19));

        return n > 0 && ((int) Math.pow(3,19))%n == 0;
    }
}