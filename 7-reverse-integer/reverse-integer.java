class Solution {
    public int reverse(int x) {
        int d,t=x,rev=0;
        if (x != 0)
        {
            while (t != 0)
            {
                d=t%10;
                if (rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10)
                {
                    return 0;
                }
                rev=rev*10+d;
                t/=10;
            }
        }
        return rev;
    }
}