import java.util.*;

class Solution {
    public int findKthLargest(int[] nums, int k) {

        Integer[] boxedNums = Arrays.stream(nums)
                                     .boxed()
                                     .toArray(Integer[]::new);
                                     
        Arrays.sort(boxedNums, Collections.reverseOrder());
        return boxedNums[k-1];
        
    }
}
