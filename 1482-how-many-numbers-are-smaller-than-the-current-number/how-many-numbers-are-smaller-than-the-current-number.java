class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] x = new int[101];
        int n = nums.length;
        for (int i = 0; i < n; i++) 
        {
            x[nums[i]]++;
        }
        for (int i = 1; i < 101; i++) 
        {
            x[i] += x[i - 1];
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) 
        {
            if (nums[i] != 0) 
                ans[i] = x[nums[i] - 1];
            else 
                ans[i] = 0;
        }
        return ans;
    }
}