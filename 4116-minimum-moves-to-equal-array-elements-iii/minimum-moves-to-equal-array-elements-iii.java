class Solution {
    public int minMoves(int[] nums) {
        int maxVal=nums[0];
        for (int num:nums) 
        {
            if (num > maxVal) 
            {
                maxVal=num;
            }
        }
        int steps=0;
        for (int num : nums) 
        {
            steps+=(maxVal-num);
        }
        return steps;
    }
}