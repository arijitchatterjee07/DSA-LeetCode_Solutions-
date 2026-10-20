class Solution {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE; 
        int max = Integer.MIN_VALUE;
        int n = salary.length;
        long sum = 0L;
        for(int i=0; i<n; i++){
            sum += (long)salary[i];
            min = Math.min(min,salary[i]);
            max = Math.max(max,salary[i]);
        }
        return (double) (sum-max-min)/ (n-2);
    }
}