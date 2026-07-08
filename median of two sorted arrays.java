class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a=nums1.length; int b=nums2.length;
        int[] m=new int[a+b];int k=0;
        int i=0,j=0;
        while(i<a && j<b)
        {
            if(nums1[i]<nums2[j])
            m[k++]=nums1[i++];
            else
            m[k++]=nums2[j++];
        }
        while(i<a)
        m[k++]=nums1[i++];
        while(j<b)
        m[k++]=nums2[j++];
        int n=m.length;
        double res;
        if(n%2==0)
        {
         res=(m[n/2]+m[(n/2)-1])/2.0;
        }
        else
            res=m[n/2];
        return res;
    }
}