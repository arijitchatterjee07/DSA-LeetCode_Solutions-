public class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        for (int num:nums1) 
        {
            hs1.add(num);
        }
        for (int num:nums2) {
            hs2.add(num);
        }
        int count1=0;
        for (int num:nums1) 
        {
            if (hs2.contains(num)) 
            {
                count1++;
            }
        }
        int count2=0;
        for (int num:nums2) {
            if (hs1.contains(num)) 
            {
                count2++;
            }
        } 
        return new int[]{count1, count2};
    }
}