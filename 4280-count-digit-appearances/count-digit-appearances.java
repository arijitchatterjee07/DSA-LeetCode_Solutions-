class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int appears=0;
        for(int i=0; i<nums.length; ++i) {
            while(0<nums[i]) {
                if(nums[i]%10==digit)
                    appears++;
                nums[i]/=10;
            }
        }
        return appears;
    }
}