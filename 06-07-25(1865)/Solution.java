class FindSumPairs {
    // Store the two input arrays
    private int[] nums1;
    private int[] nums2;

    // A frequency map to keep track of the count of elements in nums2
    private Map<Integer, Integer> cnt;

    // Constructor to initialize the object with nums1 and nums2
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        this.cnt = new HashMap<>();

        // Populate the frequency map with counts of each number in nums2
        for (int num : nums2) {
            cnt.put(num, cnt.getOrDefault(num, 0) + 1);
        }
    }

    // Adds a value to nums2 at the specified index
    public void add(int index, int val) {
        int prev = nums2[index]; // Get the current value at the index

        // Decrease the count of the old value in the frequency map
        cnt.put(prev, cnt.get(prev) - 1);

        // Update the value in nums2
        nums2[index] += val;

        // Increase the count of the new value in the frequency map
        cnt.put(nums2[index], cnt.getOrDefault(nums2[index], 0) + 1);
    }

    // Counts the number of pairs (i, j) such that nums1[i] + nums2[j] == tot
    public int count(int tot) {
        int ans = 0;

        // For each number in nums1, calculate the complement needed from nums2
        for (int num : nums1) {
            int rem = tot - num;

            // Add the count of that complement from the frequency map
            ans += cnt.getOrDefault(rem, 0);
        }

        return ans;
    }
}
