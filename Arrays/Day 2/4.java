class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        // Step 1: Detect the cycle
        do {
            slow = nums[slow];       // Move 1 step
            fast = nums[nums[fast]]; // Move 2 steps
        } while (slow != fast);

        // Step 2: Find the duplicate
        slow = nums[0]; // Reset slow to start
        while (slow != fast) {
            slow = nums[slow]; // Move 1 step
            fast = nums[fast]; // Move 1 step
        }

        return slow; // Duplicate number
    }
}
