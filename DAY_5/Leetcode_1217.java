class Solution {
    public int minCostToMoveChips(int[] position) {
        int eve_min = 0;
        int odd_min = 0;
        for(int val : position){
            if(val%2 == 0){
                eve_min++;
            }else{
                odd_min++;
            }
        }
    }
}
