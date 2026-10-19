class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        ans[0]=nums[0];
        for (int i=1;i<n;i++)
        {
            int sum=0;
            for (int j=0;j<=i;j++)
            {
                sum+=nums[j];
            }
            ans[i]=sum;
        }
        return ans;
    }
}