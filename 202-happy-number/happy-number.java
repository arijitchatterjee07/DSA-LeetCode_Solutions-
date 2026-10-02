class Solution 
{
    public boolean isHappy(int n) 
    {
        int d,sum=0,t=n;
        while (t!=1 && t!=4)
        {
            sum=0;
            while (t>0)
            {
                d=t%10;
                sum+=d*d;
                t/=10;
            }
            t=sum;
        }
        if (t==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}