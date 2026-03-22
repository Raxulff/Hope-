class Solution {
    public int sumOfMultiples(int n) {
        int sum = 0;
        for(int itr = 1;itr <= n;itr++){
            if(itr%3 == 0 || itr%5 == 0 || itr%7 == 0){
                sum = sum + itr;
            }
        }
        return sum;
    }
}