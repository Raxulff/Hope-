class Solution {
    public int integerReplacement(int n) {
        long num = n;
        int opt = 0;
        while(num != 1){
            if(num%2 == 0){
                num = num/2;
                opt++;
            }else{
                if(num == 3 || num%4 == 1){
                    num--;
                }else{
                    num++;
                }
                opt++;
            }
        }
        return opt;
    }
}