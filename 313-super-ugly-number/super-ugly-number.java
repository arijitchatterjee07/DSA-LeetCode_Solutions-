class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int len = primes.length;
        int[] pointer = new int[len];
        long[] ugly = new long[n];
        ugly[0] = 1;
        for (int i = 1; i < n; i++) {
            long min = Long.MAX_VALUE;
            for (int j = 0; j < len; j++) {
                long value = ugly[pointer[j]] * primes[j];

                if (value < min) {
                    min = value;
                }
            }
            ugly[i] = min;
            for (int j = 0; j < len; j++) {
                if (ugly[pointer[j]] * primes[j] == min) {
                    pointer[j]++;
                }
            }
        }
        return (int) ugly[n - 1];
    }
}