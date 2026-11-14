class Solution:
    def singleNumber(self, nums: list[int]) -> int:
        l=[]
        for i in nums:
            if i not in l:
                l.append(i)
        for j in l:
            if nums.count(j) == 1:
                return j