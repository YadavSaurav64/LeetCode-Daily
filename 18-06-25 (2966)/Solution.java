import java.util.Arrays;

public class Solution {
    public int[][] divideArray(int[] nums, int k) {
        // Sort the array so similar values are grouped together
        Arrays.sort(nums);
        
        int n = nums.length;
        // n must be a multiple of 3 as given
        int[][] result = new int[n / 3][3];
        
        // index to track which triplet we're filling
        int index = 0;

        for (int i = 0; i < n; i += 3) {
           // Check if the current triplet meets the condition
            if (nums[i + 2] - nums[i] <= k) {
                // Fill one row in the 2D array
                result[index][0] = nums[i];
                result[index][1] = nums[i + 1];
                result[index][2] = nums[i + 2];
                index++;
            } else {
                // If the condition fails for any triplet, return an empty array
                return new int[0][0];
            }
        }
        
        return result;
    }
}
