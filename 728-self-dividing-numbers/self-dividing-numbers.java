class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i=left;i<=right;i++) {
            int num = i;
            int f=1;
            for (int j = 0; num > 0; j++) 
            {
                int n = num % 10;
                if (n == 0) 
                {
                    f=0;
                    break;
                }
                if (i % n != 0) 
                {
                    f=0;
                    break;
                }
                num=num/10;
            }
            if (f == 1) 
            {
                ans.add(i);
            }
        }
        return ans;
    }
}