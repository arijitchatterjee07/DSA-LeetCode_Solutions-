class Solution {
    public int consecutiveNumbersSum(int n) {
        int count=0;
        for(int i=1;(2*n) > (i*(i-1));i++)
        {
            int numerator=n-(i*(i-1))/2;
            int denominator=i;
            if(numerator%denominator == 0)
            {
                count++;
            }
        }
        return count;
    }
}