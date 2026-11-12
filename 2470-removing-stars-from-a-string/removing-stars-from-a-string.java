class Solution {
    public String removeStars(String s) {
        StringBuilder sb=new StringBuilder(s);
        StringBuilder str=new StringBuilder();
        for (int i=0;i<sb.length();i++)
        {
            if (sb.charAt(i) != '*')
            {
                str.append(sb.charAt(i));
            }
            else
            {
                str.deleteCharAt(str.length()-1);
            }
        }
        return (str.toString());
    }
}