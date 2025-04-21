class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length,n=nums2.length;
        int[] newArr=new int[m+n];
        for(int i=0;i<m;i++)
        {
            newArr[i]=nums1[i];
        }
        for(int i=0;i<n;i++)
        {
            newArr[i+m]=nums2[i];
        }
        Arrays.sort(newArr);
        int l=newArr.length;

        if(l%2==1) return newArr[l/2];
        else return ((double)(newArr[l/2]+newArr[l/2-1])/2);

    }
}