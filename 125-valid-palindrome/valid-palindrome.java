class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String x = "";
        for (int i = 0; i < s.length(); i++) 
        {
            char c = s.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) 
            {
                x += c;
            }
        }
        int i = 0, j = x.length() - 1;
        while (i < j) 
        {
            if (x.charAt(i) != x.charAt(j)) 
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}