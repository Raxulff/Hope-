
class Solution {
    public int findNthDigit(int n) {
        
        long count = 1L;
        long digit = 9L;
        long start = 1L;
        while(n > digit*count){
            n -= digit*count;
            //count
            count++;
            //digit 
            digit = digit*10;
            start = start*10;
        }
        //exact digit
        start = start + (n-1)/count;
        String num = Long.toString(start);
        return num.charAt((int) ((n-1)%count)) - '0';
    }
}
