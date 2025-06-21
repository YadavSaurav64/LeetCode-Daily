class Solution {
    public int minimumDeletions(String word, int k) {
        int freq[] = new int[26];
        int ans = Integer.MAX_VALUE;

        // Count the frequency of each character
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            freq[c - 'a']++;
        }

        // Try taking each non-zero frequency as the target frequency (a)
        for (int i = 0; i < 26; i++) {
            if (freq[i] == 0) continue;
            int a = freq[i];
            int del = 0;

            // Calculate how many deletions are needed to make all character 
            // frequencies fall within the range [a, a + k]
            for (int j = 0; j < 26; j++) {
                if (freq[j] == 0) continue;

                if (a > freq[j]) {
                    // Delete all occurrences of characters with freq < a
                    del += freq[j];
                } else if (freq[j] > a + k) {
                    // Delete excess characters to bring freq down to a + k
                    del += freq[j] - a - k;
                }
            }

            // Update the minimum deletions needed across all choices of a
            ans = Math.min(del, ans);
        }

        return ans;
    }
}
