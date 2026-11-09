/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function(nums) {
    let actualSum=0,sum=0,m=nums.length;
    for (let i=0;i<nums.length;i++)
    {
        sum+=nums[i];
    }
    actualSum=(m*(m+1))/2;
    return (actualSum-sum);
};