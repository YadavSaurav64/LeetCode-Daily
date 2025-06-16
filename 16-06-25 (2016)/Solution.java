class Solution {
    public int maximumDifference(int[] nums) {
        // Initialize answer to -1 (default return value if no valid pair is found)
        // Initialize 'min' to the first element as the smallest seen so far
        int ans = -1, min = nums[0];

        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // If current element is smaller than the smallest seen so far, update 'min'
            if (nums[i] < min) {
                min = nums[i];
            }

            // If current element is greater than 'min', it can form a valid pair
            // Update the maximum difference if this pair gives a larger result
            if (nums[i] > min) {
                ans = Math.max(ans, nums[i] - min);
            }
        }

        // Return the maximum difference found, or -1 if no valid pair was found
        return ans;
    }
}
