class Solution {
    public boolean isPalindrome(String s) {
        String w="";
        for (int i=0;i<s.length();i++)
        {
            if (s.charAt(i) != ' ') 
            {
                if (Character.isLetterOrDigit(s.charAt(i)))
                {
                    w += s.charAt(i);
                }
            }
        }
        w=w.toLowerCase();
        String reversed = "";
        for (int i = w.length() - 1; i >= 0; i--) 
        {
            reversed += w.charAt(i); 
        }
        if (w.equals(reversed))
        {
            return true;
        }
        else
        {

            return false;
        }
    }
}