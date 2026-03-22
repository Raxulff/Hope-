class Solution {
    public int reverseBits(int n) {
        int ans = 0;
        for(int itr = 0;itr <= 31;itr++){
            if((n&(1<<itr)) != 0){
                ans = ans | 1<<(31-itr);
            }
        }
        return ans;
        
    }
}