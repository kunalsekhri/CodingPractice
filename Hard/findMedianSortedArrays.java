public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
         
        if ((m + n) % 2 == 1) {
            return (double) findMedianSortedArraysHelper(nums1, nums2, (m + n) / 2 + 1);
        } else {
            return ((double) findMedianSortedArraysHelper(nums1, nums2, (m + n) / 2) + 
                    findMedianSortedArraysHelper(nums1, nums2, (m + n) / 2 + 1)) / 2;
        }
    }
     
    private int findMedianSortedArraysHelper(int[] nums1, int[] nums2, int k) {
        if (nums1 == null || nums1.length == 0) {
            return nums2[k - 1];
        } 
         
        if (nums2 == null || nums2.length == 0) {
            return nums1[k - 1];
        }
         
        if (k == 1) {
            return Math.min(nums1[0], nums2[0]);
        }
         
        int m = nums1.length;
        int n = nums2.length;
         
        if (nums1[m / 2] >= nums2[n / 2]) {
            if (m / 2 + n / 2 + 1 >= k) {
                return findMedianSortedArraysHelper(Arrays.copyOfRange(nums1, 0, m / 2), 
                           nums2, 
                           k);
            } else {
                return findMedianSortedArraysHelper(nums1, 
                          Arrays.copyOfRange(nums2, n / 2 + 1, nums2.length), 
                          k - (n / 2 + 1));
            }
        } else {
            if (m / 2 + n / 2 + 1 >= k) {
                return findMedianSortedArraysHelper(nums1, 
                           Arrays.copyOfRange(nums2, 0, n / 2), 
                           k);
            } else {
                return findMedianSortedArraysHelper(Arrays.copyOfRange(nums1, m / 2 + 1, nums1.length), 
                           nums2, 
                           k - (m / 2 + 1));
            }
        }
    }
}

