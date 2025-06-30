class Solution {
    public int findLHS(int[] nums) {
        // Edge case: a single element can't form a harmonious subsequence
        if (nums.length == 1) return 0;

        int ans = 0; // To store the maximum length of harmonious subsequence
        Arrays.sort(nums); // Sort the array to bring equal and close elements together

        int i = 0, j = 0; // Two pointers for sliding window

        while (j < nums.length) {
            if (nums[j] - nums[i] < 1) {
                // Difference is less than 1, move j to include more elements
                j++;
            } else if (nums[j] - nums[i] == 1) {
                // Found a valid harmonious window, update max length
                j++;
                ans = Math.max(ans, j - i);
            } else {
                // Difference is more than 1, move i to shrink the window
                i++;
            }
        }

        return ans;
    }
}
