class Solution {
    public int[] rearrangeArray(int[] nums) {
        int positiveIndex = 0;
        int negativeIndex = 1;
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] > 0)
            {
                arr[positiveIndex]=nums[i];
                positiveIndex+=2;
            }
            else
            {
                arr[negativeIndex]=nums[i];
                negativeIndex+=2;
            }
        }
        return arr;
    }
}