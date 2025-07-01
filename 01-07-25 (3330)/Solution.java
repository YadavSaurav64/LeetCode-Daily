class Solution {
    public int possibleStringCount(String word) {
        // Initialize the answer to 1 because the original string itself is always a valid possibility
        int ans = 1;

        // Store the first character to compare with the next characters
        char prev = word.charAt(0);

        // Iterate through the string starting from the second character
        for (int i = 1; i < word.length(); i++) {
            // If the current character is the same as the previous one,
            // it means this could be a result of a long key press.
            // So, we can consider removing one occurrence of this character,
            // which gives us one more possible original string.
            if (prev == word.charAt(i)) {
                ans++; // Increment the count of possible original strings
            } else {
                // If the current character is different, update 'prev' to this new character
                prev = word.charAt(i);
            }
        }

        // Return the total number of possible original strings
        return ans;
    }
}
