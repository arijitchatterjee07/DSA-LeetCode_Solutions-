class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length,k=1;
        ArrayList<Integer> ans=new ArrayList<>();
        while (k <= 2)
        {
            for (int i=0;i<n;i++)
            {
                ans.add(nums[i]);
            }
            k++;
        }
        int[] primitiveArray = new int[ans.size()];
        for (int i = 0; i <ans.size(); i++) 
        {
            primitiveArray[i] = ans.get(i);
        }
        return primitiveArray;
    }
}