class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k){
        int n = nums.length; // Total number of elements in the array
        List<Integer> ans = new ArrayList<>(); // List to store the result indices
        int i = 0, j = 0;

        // Iterate over the array to find all indices where nums[j] == key
        while (j < n) {
            if (nums[j] == key) {
                // For each key occurrence, check indices within distance k on both sides
                while (i <= j + k && i < n) {
                    if (Math.abs(i - j) <= k) {
                        ans.add(i); // Add index i if it's within distance k from j
                    }
                    i++;
                }
            }
            j++;
        }
        return ans; // Return the list of collected indices
    }
}
