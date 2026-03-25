class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for(int ind = 0;ind < nums.length;ind++){
            if(nums[ind] != val){
                nums[index] = nums[ind];
                index++;
            }
        }
        return index;
    }
}
