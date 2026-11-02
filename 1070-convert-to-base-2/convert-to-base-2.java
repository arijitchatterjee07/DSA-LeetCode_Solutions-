class Solution {
    public String baseNeg2(int n) {
        if (n == 0) {
            return "0";
        }
        String result = "";
        while (n != 0) 
        {
            int remainder = n % -2;
            n /= -2;
            if (remainder < 0) {
                remainder += 2;
                n += 1;
            }
            result = remainder + result;
        }
        return result;
    }
}