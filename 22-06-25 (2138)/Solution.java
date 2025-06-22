class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();

        // Calculate how many groups will be needed
        int size = (n + k - 1) / k;

        // Array to store the result strings
        String ans[] = new String[size];

        // StringBuilder to construct each group
        StringBuilder str = new StringBuilder();

        int j = 0; // Index for the result array

        // Loop through characters of the string and fill groups
        for (int i = 0; j < size; i++) {
            // If characters are left in the string, add them
            if (i < n) {
                str.append(s.charAt(i));
            } else {
                // Otherwise, add the fill character
                str.append(fill);
            }

            // Once a group reaches size 'k', add it to result
            if ((i + 1) % k == 0) {
                ans[j++] = str.toString();
                str.setLength(0); // Reset the StringBuilder for the next group
            }
        }

        return ans;
    }
}
