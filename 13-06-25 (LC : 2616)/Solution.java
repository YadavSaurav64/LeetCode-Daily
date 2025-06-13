class Solution {
    public int minimizeMax(int[] nums, int p) {
        // Sort the array to enable greedy pairing of closest values
        Arrays.sort(nums);
        int n = nums.length;

        // Initialize binary search boundaries
        int l = 0, r = nums[n - 1] - nums[0];

        // Binary search to find the minimal maximum difference
        while (l < r) {
            int mid = l + (r - l) / 2;
            int cnt = 0;

            // Greedily count how many pairs we can form with difference ≤ mid
            for (int i = 0; i < n - 1; i++) {
                if (nums[i + 1] - nums[i] <= mid) {
                    cnt++; // One valid pair found
                    i++;   // Skip the next index since it's already used in the pair
                }
            }

            // If we can form at least p pairs, try a smaller maximum difference
            if (cnt >= p) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }

        // Return the minimal maximum difference found
        return l;
    }
}
