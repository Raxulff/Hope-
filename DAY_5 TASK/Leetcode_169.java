class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        int count = 0;
        int curr = nums[0];
        int elemt = -1;
        for(int ind = 0;ind < nums.length;ind++){
            if(nums[ind] == curr){
                count++;
            }
            if(nums[ind] != curr){
                count = 1;
                curr = nums[ind];
            }
            if(max < count){
                max = count;
                elemt = nums[ind];
            }
        }
        return elemt;
    }
}
