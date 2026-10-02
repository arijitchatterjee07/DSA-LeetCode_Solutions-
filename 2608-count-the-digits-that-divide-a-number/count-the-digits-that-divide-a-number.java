class Solution {
    public int countDigits(int num) {
        int t=num,count=0,d;
        while(t>0)
        {
            d=t%10;
            if (d != 0)
            {
                if (num % d == 0)
                {
                    count++;
                }
                t/=10;
            }
        }
        return count;
    }
}