class Solution {
    public int maxEvents(int[][] events) {
        int n = events.length;
        int maxDay = 0;

        // Find the latest end day among all events
        for (int[] e : events) {
            maxDay = Math.max(maxDay, e[1]);
        }

        // Min-heap (priority queue) to store end days of events available on the current day
        PriorityQueue<Integer> q = new PriorityQueue<>();

        // Sort events by their start day
        Arrays.sort(events, (a, b) -> a[0] - b[0]);

        int ans = 0; // Count of events attended
        int j = 0;   // Pointer to iterate through events

        // Iterate through each day from 1 to maxDay
        for (int i = 1; i <= maxDay; i++) {
            // Add all events that start on or before day i to the priority queue
            while (j < n && events[j][0] <= i) {
                q.offer(events[j][1]); // Add the event's end day
                j++;
            }

            // Remove events from the queue that have already ended before day i
            while (!q.isEmpty() && q.peek() < i) {
                q.poll();
            }

            // Attend the event that ends the earliest (greedy choice)
            if (!q.isEmpty()) {
                q.poll(); // Attend the event
                ans++;    // Increment the count of attended events
            }
        }

        return ans;
    }
}
