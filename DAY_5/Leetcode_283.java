class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for(int ind = 0;ind < nums.length;ind++){
            if(nums[ind] != 0){
                nums[index] = nums[ind];
                index++;
            }
        }
        while(index < nums.length){
            nums[index++] = 0;
        }
    }
}
