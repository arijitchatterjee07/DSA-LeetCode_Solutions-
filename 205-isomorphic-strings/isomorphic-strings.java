class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] lastS = new int[256];
        int[] lastT = new int[256];
        for (int i = 0; i < s.length(); i++) 
        {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if (lastS[a] != lastT[b]) 
            {
                return false;
            }
            lastS[a] = i + 1;
            lastT[b] = i + 1;
        }
        return true;
    }
}