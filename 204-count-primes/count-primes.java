class Solution {
    public int countPrimes(int n) {
        if (n <= 2) 
        {
            return 0;
        }
        int count = 0;
        if (n > 2) 
        {
            count++;
        }
        for (int i = 3; i < n; i += 2) 
        {
            if (isPrime(i) == 1) 
            {
                count++;
            }
        }
        return count;
    }

    public int isPrime(int x) 
    {
        if (x < 2) 
        {
            return 0;
        }
        if (x % 2 == 0) 
        {
            return 0;
        }
        for (long i = 3; i * i <= x; i += 2) 
        {
            if (x % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}