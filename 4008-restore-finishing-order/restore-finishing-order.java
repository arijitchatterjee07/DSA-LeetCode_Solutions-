class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {

        int[] ans = new int[friends.length];
        int index = 0;
        for(int i = 0; i < order.length; i++)
        {
            int element = order[i];
            for(int j = 0; j < friends.length; j++)
            {
                if(element == friends[j]){
                    ans[index++] = element;
                }
            }
        }
    return ans;
    }
}