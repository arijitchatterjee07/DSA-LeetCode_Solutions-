class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length,k=1;
        int[] ans=new int[(2*n)];
        int j=0;
        while (k <= 2)
        {
            for (int i=0;i<n;i++)
            {
                ans[j]=nums[i];
                j++;
            }
            k++;
        }
        return ans;
    }
}