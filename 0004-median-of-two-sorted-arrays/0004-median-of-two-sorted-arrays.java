class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l=0, r=0, i=0;
        int[] nums3 = new int[(nums1.length + nums2.length)];
        // Merge nos arrays
        while (l<nums1.length && r<nums2.length) {
            if (nums1[l] < nums2[r]) {
                nums3[i++] = nums1[l++];
            } else {
                nums3[i++] = nums2[r++];
            }
        }      

        // Unindo com a sobra de algum deles
        while (l<nums1.length) {
            nums3[i++] = nums1[l++];
        } 

        while (r<nums2.length){
            nums3[i++] = nums2[r++];
        }
        
        int size = nums3.length;
        if ((size % 2) != 0) {
            return nums3[size/2];
        } else {
            double retorno = ((nums3[size/2] + nums3[size/2 - 1])) / 2.0;
            return retorno;
        }
    }
}   