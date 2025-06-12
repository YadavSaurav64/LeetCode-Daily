class Solution {
    public int maxAdjacentDistance(int[] nums) {
        // Initialize a variable to keep track of the maximum absolute difference
        int max=0;
        // Loop through the array from the first element to the second-last and compare each element with its next neighbor
        for(int i=0;i<nums.length-1;i++){
            // Update max if the absolute difference is larger than the current max
            max=Math.max(max,Math.abs(nums[i]-nums[i+1]));
        }
        // Handle the circular case: compare the last and the first elements
        max=Math.max(max,Math.abs(nums[0]-nums[nums.length-1]));
        // Return the final maximum absolute difference
        return max;
    }
}
