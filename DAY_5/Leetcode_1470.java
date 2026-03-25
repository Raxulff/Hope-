class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        for(int ind = 0,index = 0;ind < ans.length;ind = ind + 2,index++){
            ans[ind] = nums[index];
        }
        for(int ind = 1,index = n;ind < ans.length;ind = ind + 2,index++){
            ans[ind] = nums[index];
        }
        return ans;
    }
}
