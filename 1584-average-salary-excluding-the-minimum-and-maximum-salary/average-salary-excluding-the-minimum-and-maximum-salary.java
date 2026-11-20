class Solution {
    public double average(int[] salary) {
        double sum = 0 ;
        for (int i: salary) 
        {
            sum += i; 
        } 
        Arrays.sort(salary);
        sum-=(salary[salary.length-1]+salary[0]);
        return sum/(salary.length-2);
    }
}