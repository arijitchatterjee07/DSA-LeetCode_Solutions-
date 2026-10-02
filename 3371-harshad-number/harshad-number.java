class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int t=x,sum=0;
        while (t != 0)
        {
            sum+=(t%10);
            t/=10;
        }
        if (x%sum == 0)
        {
            return sum;
        }
        else
        {
            return -1;
        }
    }
}