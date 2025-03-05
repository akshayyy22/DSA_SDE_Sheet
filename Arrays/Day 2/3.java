class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;    // Pointer for nums1's last non-zero element
        int j = n - 1;    // Pointer for nums2's last element
        int k = m + n - 1; // Pointer for the last position of nums1 (full size)
        
        // Step 1: Compare elements from the back
        while (i >= 0 && j >= 0) {
            // Put the larger element at the end of nums1
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;  // Move i pointer to the left
            } else {
                nums1[k] = nums2[j];
                j--;  // Move j pointer to the left
            }
            k--; // Move k pointer to the left
        }
        
        // Step 2: Copy any remaining elements from nums2
        // (If nums2 has leftover elements and nums1 is exhausted)
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}
