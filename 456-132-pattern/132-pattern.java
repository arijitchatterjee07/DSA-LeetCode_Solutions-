class Solution {
    public boolean find132pattern(int[] nums) {
        if (nums.length < 3) 
        {
            return false;
        }
        int prevMin = Integer.MIN_VALUE;
        int Peak = nums.length;
        for (int i = nums.length - 1; i >= 0; i--) 
        {
            if (nums[i] < prevMin) 
            {
                return true;
            }
            while (Peak < nums.length && nums[i] > nums[Peak]) 
            {
                prevMin = nums[Peak++];
            }
            Peak--;
            nums[Peak] = nums[i];
        }
        return false;
    }
}