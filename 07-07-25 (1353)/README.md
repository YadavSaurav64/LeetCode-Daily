# Maximum Number of Events That Can Be Attended

## 🧩 Problem

You are given an array of events where `events[i] = [startDayi, endDayi]`. Every event i starts at `startDayi` and ends at `endDayi`.

You can attend an event i on any day `d` such that `startDayi <= d <= endDayi`. However, you can only attend one event per day.

Return the **maximum number of events** you can attend.

**Example:**

**Input:** `events = [[1,2],[2,3],[3,4]]`  
**Output:** `3`

**Explanation:**
- Attend the first event on day 1.
- Attend the second event on day 2.
- Attend the third event on day 3.

All events can be attended without overlapping.

---

## 🧠 Intuition

To attend the maximum number of events, we should always try to attend the event that ends the earliest among the available ones. This greedy approach ensures we leave room for future events.

We simulate each day and use a priority queue to keep track of the end days of events that are available on that day. Each day, we:
- Add new events that start on that day.
- Remove events that have already expired.
- Attend the event that ends the soonest.

---

## 🛠️ Approach

1. Sort the events by their start day.
2. Use a min-heap (priority queue) to store the end days of available events.
3. Iterate through each day from 1 to the latest end day of any event.
4. For each day:
   - Add all events starting that day to the heap.
   - Remove events from the heap that have already ended.
   - Attend the event with the earliest end day (if any).
5. Count and return the number of events attended.

---

## ⏱️ Time Complexity

- **O(n log n)** – due to sorting and heap operations

## 🗂️ Space Complexity

- **O(n)** – for storing events in the heap
