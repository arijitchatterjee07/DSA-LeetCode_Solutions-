class Solution {
    public int singleNonDuplicate(int[] nums) {
        int res=0;
        for (int x:nums)
        {
            res^=x;
        }
        return res;
    }
}