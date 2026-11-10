import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        List<int[]> freqList = new ArrayList<>();
        int count = 1;
        for (int i = 1; i < nums.length; i++) 
        {
            if (nums[i] == nums[i - 1]) 
            {
                count++;
            } 
            else 
            {
                freqList.add(new int[]{count, nums[i - 1]});
                count = 1;
            }
        }
        freqList.add(new int[]{count, nums[nums.length - 1]});
        freqList.sort((a, b) -> b[0] - a[0]);
        int[] result = new int[k];
        for (int i = 0; i < k; i++) 
        {
            result[i] = freqList.get(i)[1];
        }
        return result;
    }
}