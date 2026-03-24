class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] rightSum = new int[n];
        int[] leftSum = new int[n];
        int sum1= 0,sum2 =0;
        for(int ind = 0;ind < n;ind++){
            sum1+=nums[ind];
            rightSum[ind] = sum1;
        }
        for(int ind = n-1;ind >=0;ind--){
            sum2+=nums[ind];
            leftSum[ind] = sum2;
        }
        System.out.print(Arrays.toString(leftSum));
        System.out.print(Arrays.toString(rightSum));
        for(int i = 0;i < n;i++){
            int leftSide = (i == 0) ? 0 : rightSum[i - 1];
            int rightSide = (i == n - 1) ? 0 : leftSum[i + 1];
            if(leftSide == rightSide){
                return i;
            }
        }
        return -1;
    }
    
}
