class Solution {
    public int minMaxDifference(int num) {
        // Convert the input number to a string for easier digit manipulation
        String s = Integer.toString(num);
        
        // Create a copy of the original string to use for minimum value calculation
        String t = s;

        int pos = 0;
        // Find the first digit that is not '9' to remap it to '9' for maximum value
        while (pos < s.length() && s.charAt(pos) == '9') {
            pos++;
        }

        // If a non-'9' digit is found, replace all its occurrences with '9' to get the max value
        if (pos < s.length()) {
            s = s.replace(s.charAt(pos), '9');
        }

        // For minimum value, replace all occurrences of the first digit with '0'
        t = t.replace(t.charAt(0), '0');

        // Convert the modified strings back to integers and return their difference
        return Integer.parseInt(s) - Integer.parseInt(t);
    }
}
