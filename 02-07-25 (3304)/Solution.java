class Solution {
    public char kthCharacter(int k) {
        // Initialize the string with the starting character 'a'
        StringBuilder str = new StringBuilder();
        str.append('a');

        // Keep performing the operation until the string has at least k characters
        while (str.length() < k) {
            int n = str.length(); // Store the current length of the string

            // For each character in the current string, compute its next character
            for (int i = 0; i < n; i++) {
                // Calculate the next character in the alphabet with wrap-around using modulo 26
                // 'z' becomes 'a', 'a' becomes 'b', etc.
                char nextChar = (char) ('a' + ((str.charAt(i) - 'a') + 1) % 26);

                // Append the next character to the string
                str.append(nextChar);
            }
        }

        // Return the k-th character (1-based index, so subtract 1)
        return str.charAt(k - 1);
    }
}
