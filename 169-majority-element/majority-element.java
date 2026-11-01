class Solution {
    public int majorityElement(int[] nums) {
        int count = 0,ele = 0;
        for (int i=0;i<nums.length;i++) 
        {
            if (count == 0) 
            {
                count++;
                ele=nums[i];
            } 
            else if (ele == nums[i]) 
            {
                count++;
            } 
            else 
            {
                count--;
            }
        }
        return ele;
    }
}