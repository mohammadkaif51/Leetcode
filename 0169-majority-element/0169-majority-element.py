class Solution(object):
    def majorityElement(self, nums):
        a=sorted(nums)
        b=len(a)/2
        c=a[b]
        return c