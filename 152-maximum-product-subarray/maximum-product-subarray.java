class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        for(int i = 0; i < nums.length; i++) {
            int sum = 1;
            for(int j = i; j < nums.length; j++) {
                sum *= nums[j];

                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }
}