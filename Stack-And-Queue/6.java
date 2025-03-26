class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int[] arr = new int[nums1.length];
        Arrays.fill(arr, -1); 

        for (int j = 0; j < nums1.length; j++) {
            boolean found = false;
            for (int i = 0; i < nums2.length; i++) {
                if (nums1[j] == nums2[i]) { 
                    found = true; 
                }
                if (found && nums2[i] > nums1[j]) { 
                    arr[j] = nums2[i]; 
                    break;
                }
            }
        }
        return arr; 
    
        
    }
}