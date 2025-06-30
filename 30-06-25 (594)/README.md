# Longest Harmonious Subsequence

## 🧩 Problem  
We define a harmonious array as one where the **difference between its maximum and minimum values is exactly 1**.  
Given an integer array `nums`, return the **length of its longest harmonious subsequence** among all possible subsequences.

A subsequence of an array is a sequence that can be derived by deleting some or no elements without changing the order of the remaining elements.

**Example:**  
**Input:** `nums = [1,3,2,2,5,2,3,7]`  
**Output:** `5`  

**Explanation:**  
The longest harmonious subsequence is `[3,2,2,2,3]`.  
The max is 3, the min is 2 → difference is 1 ✅

---

## 🧠 Intuition  
Sorting the array helps group similar elements together.  
By using a **sliding window**, we can efficiently find the longest subarray where the difference between the smallest and largest elements is exactly 1.

---

## 🛠️ Approach  
1. **Sort** the array to bring close values together.  
2. Use two pointers `i` and `j` to define a window.  
3. Expand `j` while the difference between `nums[j]` and `nums[i]` is ≤ 1.  
4. If the difference is exactly 1, update the maximum length.  
5. If the difference exceeds 1, move `i` forward to shrink the window.

---
## ⏱️ Time Complexity 
- **O(n logn)** – due to sorting

## 🗂️ Space Complexity
- **O(1)** – constant extra space
