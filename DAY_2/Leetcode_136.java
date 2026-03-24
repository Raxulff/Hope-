
class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;
        for(int ind = 0;ind<nums.length;ind++){
            xor = xor^nums[ind];
        }
        return xor;
    }
}
