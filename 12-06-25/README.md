# Maximum Absolute Difference in Circular Array

## 🧩 Problem
Given a **circular array** of integers, return the **maximum absolute difference between any two adjacent elements**, where the first and last elements are also considered adjacent.

**Example:**  
Input: `[1, 2, 4]`  
Output: `3`  
Explanation: `|4 - 1| = 3` is the maximum.

---

## 🧠 Intuition
Since the array is circular, the first and last elements are adjacent.  
To find the max absolute difference:
- Traverse the array from index 0 to n-2 and compare `nums[i]` and `nums[i+1]`.
- After the loop, compare the last element with the first (`nums[n-1]` with `nums[0]`).
- Update the max if any difference is larger.

---

## 🛠️ Approach
1. Initialize `max = 0`.
2. Loop through `nums`, compute `abs(nums[i] - nums[i+1])`, and update `max`.
3. Finally, compute `abs(nums[n-1] - nums[0])` and compare again.
4. Return `max`.

---

## ⏱️ Time Complexity
- **O(n)** - where n = size of the array.

## 🗂️ Space Complexity
- **O(1)** - We only use a single variable `max` to store the result, so no extra space is required.
