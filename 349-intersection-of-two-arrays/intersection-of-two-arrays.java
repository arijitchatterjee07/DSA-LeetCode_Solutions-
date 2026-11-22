class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> hs1=new HashSet<>();
        HashSet <Integer> hs2=new HashSet<>();
        for (int i=0;i<nums1.length;i++)
        {
            hs1.add(nums1[i]);
        }
        for (int i=0;i<nums2.length;i++)
        {
            hs2.add(nums2[i]);
        }
        ArrayList <Integer> arr=new ArrayList<>();
        for (int k:hs1)
        {
            if (hs2.contains(k))
            {
                arr.add(k);
            }
        }
        int[] res=new int[arr.size()];
        for (int k=0;k<res.length;k++) 
        {
            res[k]=arr.get(k);
        }
        return res;
    }
}