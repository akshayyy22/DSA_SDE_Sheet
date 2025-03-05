class Solution {
    public int[] findMissingAndRepeating(int[] nums) {
        int n = nums.length;
        long sum_N = (long) n * (n + 1) / 2;
        long sum_sq_N = (long) n * (n + 1) * (2 * n + 1) / 6;
        
        long sum_A = 0, sum_sq_A = 0;
        for (int num : nums) {
            sum_A += num;
            sum_sq_A += (long) num * num;
        }
        
        long diff = sum_N - sum_A;  // Missing - Repeating
        long sumDiff = (sum_sq_N - sum_sq_A) / diff; // Missing + Repeating
        
        int missing = (int) ((diff + sumDiff) / 2);
        int repeating = (int) (missing - diff);
        
        return new int[]{missing, repeating};
    }
}
