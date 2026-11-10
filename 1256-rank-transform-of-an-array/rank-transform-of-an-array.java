// class Solution {
//     public int[] arrayRankTransform(int[] arr) {
//         int[] t=Arrays.copyOf(arr,arr.length);
//         Arrays.sort(arr);
//         int[] ans=new int[arr.length];
//         for (int i=0;i<arr.length;i++)
//         {
//             ans[i]=(Arrays.binarySearch(arr,t[i]))+1;
//         }
//         return ans;
//     }
// }

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sortedUnique = arr.clone();
        Arrays.sort(sortedUnique);
        sortedUnique=Arrays.stream(sortedUnique).distinct().toArray();
        int[] ans=new int[arr.length];
        for (int i=0;i<arr.length;i++) 
        {
            ans[i]=Arrays.binarySearch(sortedUnique,arr[i])+1;
        }
        return ans;
    }
}