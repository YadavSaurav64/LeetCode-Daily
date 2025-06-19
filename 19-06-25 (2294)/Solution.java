class Solution {
    public int partitionArray(int[] nums, int k) {
        // We need at least one subsequence initially
        int ans = 1;

        // Sort the array to bring elements in increasing order
        // This helps group values with minimal difference
        Arrays.sort(nums);

        // Start with the first element as the minimum of the current subsequence
        int min = nums[0];

        // Traverse the array to check if the current number can fit into the existing subsequence
        for (int i = 0; i < nums.length; i++) {
            // If the current number exceeds the allowed range with respect to 'min'
            if (nums[i] - min > k) {
                // Start a new subsequence
                ans++;

                // Reset the new minimum for the new subsequence
                min = nums[i];
            }
        }

        // Return the total number of subsequences required
        return ans;
    }
}
