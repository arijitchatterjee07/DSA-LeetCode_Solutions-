class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] res=new int[nums.length+nums.length];
        for(int i=0;i<nums.length;i++){
            res[i]=nums[i];
        }
        int u=nums.length;
        for(int i=nums.length-1;i>=0;i--){
            res[u]=nums[i];
            u++;
        }
        return res;
    }
}