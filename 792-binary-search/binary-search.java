class Solution {
    public int search(int[] nums, int target) {
      int n=nums.length;
      int low=0,high=n-1,mid,idx;
      boolean f = false;
        while (low <= high)
        {
          mid=low+(high-low)/2;
          if (nums[mid] == target)
          {
            return mid;
          }
          else if (nums[mid] < target)
          {
            low=mid+1;
          }
          else if (nums[mid] > target)
          {
            high=mid-1;
          }
        }
        return -1;
    }
}