class Solution(object):
    def frequencySort(self, s):
        d={};t=[];temp=[]
        l=list(s)
        for i in l:
            if i not in d:
                d[i]=l.count(i)
        for j in d:
            t.append([d[j],j])
        t.sort(reverse=True)
        for k in t:
            temp.append(k[-1]*k[0])
        return("".join(temp))