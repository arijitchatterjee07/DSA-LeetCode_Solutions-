class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int low=0;
        int high=nums.length-1;
        for (int i=nums.length-1;i >= 0;i--) 
        {
            if (Math.abs(nums[low]) > Math.abs(nums[high])) 
            {
                ans[i] =nums[low]*nums[low];
                low++;
            } 
            else 
            {
                ans[i]=nums[high]*nums[high];
                high--;
            }
        }
        return ans;        
    }
}