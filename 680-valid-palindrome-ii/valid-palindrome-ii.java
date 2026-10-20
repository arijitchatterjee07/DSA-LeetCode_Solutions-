import java.util.ArrayList;

class Solution {
    public boolean validPalindrome(String s) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) 
        {
            list.add(String.valueOf(s.charAt(i)));
        }
        int left = 0, right = list.size() - 1;
        while (left < right) 
        {
            if (!list.get(left).equals(list.get(right))) 
            {
                return isPalindromeRange(s, left + 1, right) || isPalindromeRange(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }
    
    public boolean isPalindromeRange(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) 
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}