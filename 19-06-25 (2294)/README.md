# Partition Array Such That MAximum Difference is K

## 🧩 Problem  
You are given an integer array `nums` and an integer `k`.  
Your task is to **partition** the array into one or more **subsequences** such that in each subsequence, the **difference between the maximum and minimum** elements is **at most `k`**.  

Each element in `nums` must appear in exactly one subsequence.  
Return the **minimum number** of such subsequences needed.

**Example:**  
**Input:** `nums = [3,6,1,2,5]`, `k = 2`  
**Output:** `2`  
**Explanation:** Two valid subsequences are `[3,1,2]` and `[6,5]`.

---

## 🧠 Intuition  
To keep the difference between min and max in any group within `k`, it's smart to:
- **Sort** the array so that similar elements are adjacent.
- Use a greedy approach:
  - Track the **minimum** value of the current subsequence.
  - As soon as an element is found with a difference greater than `k` from this minimum, it starts a **new subsequence**.
  
This strategy ensures we make as few subsequences as necessary by keeping consecutive values grouped together whenever possible.

---

## 🛠️ Approach  
1. **Sort** the `nums` array.
2. Initialize a counter `ans` to `1` (at least one subsequence needed).
3. Set the **first element** as the `min` of the current subsequence.
4. Traverse the array:
   - If `nums[i] - min > k`, start a **new subsequence**, set `min = nums[i]`, and increment `ans`.
   - Otherwise, continue in the current subsequence.
5. Return `ans` as the total number of subsequences needed.

---

## ⏱️ Time Complexity  
- **O(n log n)** due to sorting.

## 🗂️ Space Complexity  
- **O(1)** extra space used (in-place sorting and iteration).
