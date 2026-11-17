class Solution {
    public int thirdMax(int[] nums) {
        int first = nums[0], second = Integer.MIN_VALUE;
        for (int x : nums) 
        {
            if (first < x) 
            {
                second = first;
                first = x;
            } 
            else if (second < x && first != x) 
            {
                second = x;
            }
        }
        int third = Integer.MIN_VALUE, COUNT = 0;
        for (int x : nums) 
        {
            if (x < second && third <= x) 
            {
                third = x;
                COUNT++;
            }
        }
        if (third == Integer.MIN_VALUE && COUNT == 0)
        {
            return first;
        }
        else
        {
            return third;
        }
    }
}