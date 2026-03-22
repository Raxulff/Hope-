class Solution {
    public boolean isThree(int n) {
        int count = 0;
        for(int itr = 1;itr <= n;itr++){
            if(n%itr == 0){
                count++;
            }
        }
        return count ==3;
    }
}