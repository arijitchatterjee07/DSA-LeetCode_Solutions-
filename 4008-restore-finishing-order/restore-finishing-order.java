class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        List<Integer> result = new ArrayList<>();
        for (int id : order) 
        {
            for (int f : friends) 
            {
                if (id == f) 
                {
                    result.add(f);
                    break;
                }
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}