class Solution(object):
    def reverseString(self, s):
        st=0
        e=len(s)-1
        while st <= e:
            s[st], s[e] = s[e], s[st]
            st+=1
            e-=1