class Solution {

    // Helper function to create a palindrome number in base-10.
    // If 'odd' is true, it creates an odd-length palindrome.
    long createPalindrome(long num, boolean odd) {
        long x = num;
        if (odd) x /= 10; // Skip the last digit to avoid duplication in the middle.
        while (x > 0) {
            num = num * 10 + x % 10; // Append digits in reverse to make it a palindrome.
            x /= 10;
        }
        return num;
    }

    // Helper function to check if a number is a palindrome in the given base.
    boolean isPalindrome(long num, int base) {
        StringBuilder sb = new StringBuilder();
        // Convert the number to the given base.
        while (num > 0) {
            sb.append((char) (num % base + '0'));
            num /= base;
        }
        String s = sb.toString();
        int i = 0, j = s.length() - 1;
        // Compare characters from both ends to check for palindrome.
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }

    // Main function to find the sum of the n smallest k-mirror numbers.
    public long kMirror(int k, int n) {
        long sum = 0;
        // Try generating palindromes with increasing digit lengths.
        for (long len = 1; n > 0; len *= 10) {
            // Generate odd-length palindromes.
            for (long i = len; n > 0 && i < len * 10; i++) {
                long p = createPalindrome(i, true);
                // Check if it's also a palindrome in base-k.
                if (isPalindrome(p, k)) {
                    sum += p;
                    n--;
                }
            }
            // Generate even-length palindromes.
            for (long i = len; n > 0 && i < len * 10; i++) {
                long p = createPalindrome(i, false);
                if (isPalindrome(p, k)) {
                    sum += p;
                    n--;
                }
            }
        }
        return sum;
    }
}
