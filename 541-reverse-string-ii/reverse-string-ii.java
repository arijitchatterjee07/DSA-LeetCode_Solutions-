class Solution {
    public String reverseStr(String s, int k) 
    {
        char[] ch = s.toCharArray();
        for (int i=0;i<ch.length;i+=(2*k)) 
        {
            int end = Math.min(i+k,ch.length);
            revArray(ch, i, end);
        }
        return String.valueOf(ch);
    }

    public void revArray(char[] x, int a, int b) 
    {
        for (int i=a,j=b-1;i<j;i++,j--) 
        {
            char temp = x[i];
            x[i] = x[j];
            x[j] = temp;
        }
    }
}