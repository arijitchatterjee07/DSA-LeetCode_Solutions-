import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap <Integer,Integer> hm=new HashMap<>();
        for (int i:nums)
        {
            if (hm.containsKey(i))
            {
                int freq=hm.get(i);
                hm.put(i,freq+1);
            }
            else
            {
                hm.put(i,1);
            }
        }
        for (int i:nums)
        {
            if (hm.get(i) >= 2)
            {
                return true;
            }
        }
        return false;
    }
}
