class Solution {
    public int missingMultiple(int[] nums, int k) {
        int currentMultiple = k;   
        while (true) 
        {
            boolean found = false;
            for (int num : nums) 
            {
                if (num == currentMultiple) 
                {
                    found = true;
                    break;
                }
            }
            if (!found) 
            {
                return currentMultiple;
            }
            currentMultiple += k;
        }
    }
}