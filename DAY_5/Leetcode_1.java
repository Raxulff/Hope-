
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int ind1 = 0;ind1 < nums.length;ind1++){
            for(int ind2 = 0;ind2 < nums.length;ind2++){
                if(ind1 != ind2 && nums[ind1] + nums[ind2] == target){
                    return new int[]{ind1,ind2};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
