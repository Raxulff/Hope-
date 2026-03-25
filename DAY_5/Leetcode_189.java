class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        //System.out.print(Arrays.toString(nums));
    }
    public static void reverse(int[] nums,int st,int end){
        for(;st < end;st++,end--){
            int temp = nums[st];
            nums[st] = nums[end];
            nums[end] = temp;
        }
    }
}
