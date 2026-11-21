class Solution
{
    public boolean isIsomorphic(String s, String t)
    {
        if (s.length() != t.length())
        {
            return false;
        }
        HashMap<Character, Character> hms = new HashMap<>();
        HashMap<Character, Character> hmt = new HashMap<>();
        for (int i = 0; i < s.length(); i++)
        {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (hms.containsKey(c1) && hms.get(c1) != c2)
            {
                return false;
            }
            if (hmt.containsKey(c2) && hmt.get(c2) != c1)
            {
                return false;
            }
            hms.put(c1, c2);
            hmt.put(c2, c1);
        }
        return true;
    }
}