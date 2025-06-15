class Solution {
    public int maxDiff(int num) {
        // Convert the number to a string for easier digit manipulation
        String s = Integer.toString(num);
        String t = s; // Create a copy to generate the maximum variant

        // Generate the minimum possible value by replacing a digit with '0' or '1'
        for (int i = 0; i < s.length(); i++) {
            // Skip if digit is already '1' or '0' since replacing it won't reduce the number
            if (s.charAt(i) != '1' && s.charAt(i) != '0') {
                if (i != 0) {
                    // If it's not the first digit, replace all occurrences of this digit with '0'
                    s = s.replace(s.charAt(i), '0');
                } else {
                    // If it's the first digit, replace with '1' to avoid leading zeros
                    s = s.replace(s.charAt(i), '1');
                }
                break; // Only perform one replacement
            }
        }

        // Generate the maximum possible value by replacing the first digit that's not '9' with '9'
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) != '9') {
                t = t.replace(t.charAt(i), '9');
                break; // Only perform one replacement
            }
        }

        // Return the difference between the maximum and minimum values
        return Integer.parseInt(t) - Integer.parseInt(s);
    }
}
