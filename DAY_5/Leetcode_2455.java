class Solution {
    public int averageValue(int[] nums) {
        int c = 0;
        int sum = 0;
        for(int val : nums){
            if(val%6 == 0){
                c++;
                sum+=val;
            }
        }
        if(c==0) return 0;
        return sum/c;
    }
}
