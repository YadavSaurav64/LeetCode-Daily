class Solution {
    public char kthCharacter(long k, int[] operations) {
        int ans = 0; // This will count how many times operation type 1 (character shift) has been applied on the path to the k-th character
        int t;

        // Traverse backwards from the k-th character to the original string
        while (k != 1) {
            // Find the highest power of 2 less than or equal to k
            // This gives us the level in the operation tree where the k-th character lies
            t = 63 - Long.numberOfLeadingZeros(k);

            // If k is exactly a power of 2, we step back one level
            if ((1L << t) == k) {
                t--;
            }

            // Move to the corresponding character in the previous version of the string
            k = k - (1L << t);

            // If the operation at this level was type 1 (shift characters), increment the shift counter
            if (operations[t] != 0) {
                ans++;
            }
        }

        // The final character is 'a' shifted by the number of type 1 operations encountered, modulo 26
        return (char) ('a' + (ans % 26));
    }
}
