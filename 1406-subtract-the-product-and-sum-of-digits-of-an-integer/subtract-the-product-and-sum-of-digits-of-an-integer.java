class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0,pro=1,t;
        t=n;
        while(t>0)
        {
            sum+=(t%10);
            pro*=(t%10);
            t/=10;
        }
        return(pro-sum);
    }
}