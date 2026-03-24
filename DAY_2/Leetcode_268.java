
class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int val : nums){
            sum+=val;
        }
        int n = nums.length;
        return n*(n+1)/2 - sum;
    }
}
