class Solution {
    public boolean judgeCircle(String moves) {
        int count1 = 0;
        int count2 = 0;
        for(char ch : moves.toCharArray()){
            if(ch == 'U'){
                count1++;
            }else if(ch == 'D'){
                count1--;
            }
            else if(ch == 'R'){
                count2++;
            }else if(ch == 'L'){
                count2--;
            }
        }
        return (count1 == 0 && count2 ==0);
    }
}
