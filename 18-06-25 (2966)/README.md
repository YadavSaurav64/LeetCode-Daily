# Divide Array Into Arrays With Max Difference

## 🧩 Problem  
You are given an integer array `nums` of size `n`, where `n` is a multiple of `3`, and an integer `k`.  
Your task is to **divide** `nums` into `n / 3` groups of **exactly 3 elements each**, such that in every group, the difference between the **maximum and minimum** elements is **at most `k`**.

Return the resulting **2D array** if the division is possible.  
If not, return an empty array.

**Example:**  
**Input:** `nums = [1,3,4,8,7,9,3,5,1]`, `k = 2`  
**Output:** `[[1,1,3],[3,4,5],[7,8,9]]`  
**Explanation:** Each triplet has a max-min difference of at most 2.

---

## 🧠 Intuition  
The most efficient way to form balanced groups is to:
- **Sort** the array to keep close elements grouped together.
- Iterate over every 3 consecutive elements and check:
  - Is the difference between the **first and third** element ≤ `k`?
  - If yes, that forms a valid group.
  - If not, return an empty array since no rearrangement is allowed post-sort.

This guarantees the constraints are respected efficiently and the grouping is consistent.

---

## 🛠️ Approach  
1. Sort the array `nums` in ascending order.
2. Initialize a 2D array `ans` of size `[n / 3][3]` to store the groups.
3. Traverse `nums` using index `i`, tracking triplets:
   - For every index divisible by 3 (`i % 3 == 0`), store `min = nums[i]`.
   - Check if the difference between `nums[i]` and `min` exceeds `k`.  
     - If yes, return an empty array.
   - Place each element in the appropriate triplet using modulo (`i % 3`).
4. Return the filled 2D array `ans`.

---

## ⏱️ Time Complexity  
- **O(n log n)** - Due to sorting.

## 🗂️ Space Complexity  
- **O(n)** - For the output 2D array.
