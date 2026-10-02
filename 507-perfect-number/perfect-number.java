class Solution {
    public boolean checkPerfectNumber(int num) {
        int t,i,s=0;
        for(i=1;i<num;i++)
            {
            if(num%i == 0)
                s+=i;
        }
        if(s == num)
            return true;
        else
            return false;
    }
}