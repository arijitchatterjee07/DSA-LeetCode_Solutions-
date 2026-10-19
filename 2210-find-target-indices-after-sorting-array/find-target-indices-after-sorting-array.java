class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> res = new ArrayList<>();
        int count = 0;
        int start = 0;
        for(int i = 0; i < nums.length; i++) 
        {
            if(nums[i] == target) 
            {
                count++;
            }
            if(nums[i] < target) 
            {
                start++;
            }
        }
        while(count-- != 0) 
        {
            res.add(start++);
        }
        return res;
    }
}