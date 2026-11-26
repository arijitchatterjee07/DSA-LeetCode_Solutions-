class Solution {
    public long sumAndMultiply(int n) {
        long sum = 0, num = 0, i = 1;
        while(n > 0)
        {
            int temp = n % 10;
            if(temp != 0)
            {
                sum += temp;
                num = temp*i + num;
                i *= 10;
            }
            n /= 10;
        }
        return sum*num;
    }
}