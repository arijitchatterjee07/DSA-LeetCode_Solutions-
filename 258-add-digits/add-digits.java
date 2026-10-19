class Solution {
    public int addDigits(int num) {
        int digi,t=num,sum;
        while (t > 9)
        {
          sum=0;
            while (t != 0)
            {
                digi=t%10;
                sum+=digi;
                t/=10;
            }
          t=sum;
        }
        return t;
    }
}