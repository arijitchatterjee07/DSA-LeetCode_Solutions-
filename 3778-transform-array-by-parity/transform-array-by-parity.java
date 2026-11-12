class Solution {
    public int[] transformArray(int[] nums) {
        int even = 0;
        int odd = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2 == 0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        int i=0;
        while(even>0)
        {
            nums[i++]=0;
            even--;
        }
        while(odd>0)
        {
            nums[i++]=1;
            odd--;
        }
        return nums;
    }
}