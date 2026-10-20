class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int appears = 0;
        for (int num : nums) {
            while (num > 0) {
                if (num % 10 == digit) {
                    appears++;
                }
                num /= 10;
            }
        }
        return appears;
    }
}