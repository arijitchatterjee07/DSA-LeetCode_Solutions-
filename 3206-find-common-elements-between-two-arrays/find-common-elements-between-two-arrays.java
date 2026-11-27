class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        boolean[] set1 = new boolean[101];
        boolean[] set2 = new boolean[101];
        for (int num : nums1) 
        {
            set1[num] = true;
        }
        for (int num : nums2) 
        {
            set2[num] = true;
        }
        int count1 = 0;
        for (int num:nums1) 
        {
            if (set2[num]) 
            {
                count1++;
            }
        }
        int count2 = 0;
        for (int num:nums2) 
        {
            if (set1[num]) 
            {
                count2++;
            }
        }
        return new int[]{count1, count2};
    }
}