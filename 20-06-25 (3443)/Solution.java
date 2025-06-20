class Solution {
    public int maxDistance(String s, int k) {
        int x = 0, y = 0; // Current coordinates
        int ans = 0;      // Track the maximum Manhattan distance
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            // Update position based on current direction
            switch(c) {
                case 'N': y++; break;
                case 'S': y--; break;
                case 'E': x++; break;
                case 'W': x--; break;
            }

            // Calculate current Manhattan distance from origin
            int manhattan = Math.abs(x) + Math.abs(y);

            // You can use up to k changes to push yourself farther.
            // Each change can potentially increase distance by 2 (a better direction),
            // but you can't move farther than the number of steps taken so far (i+1)
            int possible = Math.min(manhattan + k * 2, i + 1);
            
            // Update the answer with the best distance seen so far
            ans = Math.max(ans, possible);
        }

        return ans; // Maximum Manhattan distance after processing all steps
    }
}
