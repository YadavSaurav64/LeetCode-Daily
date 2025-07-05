class Solution {
    public int findLucky(int[] arr) {
        // Create a frequency array to count occurrences of each number.
        // Since the problem constraints limit values to 1 <= arr[i] <= 500,
        // we use an array of size 501 (index 0 to 500).
        int[] a = new int[501];
        
        // Count the frequency of each number in the input array.
        for (int i = 0; i < arr.length; i++) {
            a[arr[i]]++;
        }

        // Initialize the answer to 0 (we'll use this to track the largest lucky number).
        int ans = 0;

        // Iterate through the input array again to find lucky numbers.
        for (int i = 0; i < arr.length; i++) {
            // A lucky number is one whose frequency equals its value.
            if (a[arr[i]] == arr[i]) {
                // Mark this number as processed to avoid duplicate checks.
                a[arr[i]] = -1;
                // Update the answer with the maximum lucky number found so far.
                ans = Math.max(arr[i], ans);
            }
        }

        // If a lucky number was found, return it; otherwise, return -1.
        return (ans > 0) ? ans : -1;
    }
}
