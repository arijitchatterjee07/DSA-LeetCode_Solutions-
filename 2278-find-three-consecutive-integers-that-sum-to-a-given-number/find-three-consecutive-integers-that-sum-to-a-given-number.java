class Solution {
    public long[] sumOfThree(long num) {

        if (num % 3 != 0) {
            return new long[] {};
        }

        long middle = num / 3;

        return new long[] { middle - 1, middle, middle + 1 };

    }
}