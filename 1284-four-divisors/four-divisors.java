class Solution {
    public int sumFourDivisors(int[] nums) {
        int total = 0;
        for(int i = 0; i < nums.length; i++) 
        {
            int count = 0;
            int sum = 0;
            for(int j = 1; j*j <= nums[i]; j++) 
            {
                if(nums[i] % j == 0) 
                {
                    count++;
                    sum += j;
                    if(j != nums[i]/j) 
                    {
                        count++;
                        sum += nums[i]/j;
                    }
                }
            }
            if(count == 4) 
            {
                total += sum;
            }
        }
        return total;
    }
}