
class Solution {
    public int maximumWealth(int[][] accounts) {
        int R = accounts.length;
        int C = accounts[0].length;
        int max = Integer.MIN_VALUE;
        for(int row = 0;row < R;row++){
            int sum = 0;
            for(int col = 0;col <C;col++){
                sum+=accounts[row][col];
            }
            max = Math.max(sum,max);
        }
        return max;
    }
}
