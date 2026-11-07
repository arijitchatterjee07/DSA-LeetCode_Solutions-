class Solution {
    public int countElements(int[] nums) {
        int c=0;
        int min=nums[0];
        int max=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<min)
            {
                min=nums[i];
            }
            else if(nums[i]>max)
            {
                max=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>min && nums[i]<max)
            {
                c++;
            }
        }
        return c;
    }
}