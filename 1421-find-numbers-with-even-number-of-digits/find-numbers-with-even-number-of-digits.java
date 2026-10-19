class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for (int i=0;i<nums.length;i++)
        {
            int count=0;
            int t=nums[i];
            while (t != 0)
            {
                count++;
                t/=10;
            }
            if (count%2 == 0)
            {
                c++;
            }
        }
        return c;
    }
}