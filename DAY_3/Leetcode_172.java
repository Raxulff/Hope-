
class Solution {
    public int trailingZeroes(int n) {
        // number of five
        // if(n < 5) return 0;
        // int count = 0;
        // for(int itr = 5;itr <= n;itr++){
        //     if(itr%5 == 0){
        //         count = count + itr/5;
        //     }
        // }
        int count = 0;
        while(n>0){
           
            count+=n/5;
             n/=5;
        }
        return count;
    }
}
