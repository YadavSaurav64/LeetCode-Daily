# Find All K-Distant Indices in an array 

## 🧩 Problem  
You are given a 0-indexed integer array `nums` and two integers `key` and `k`.  
A **k-distant index** is an index `i` such that there exists at least one index `j` where:  
- `|i - j| <= k` and  
- `nums[j] == key`  

Return a list of **all such indices**, sorted in increasing order.

**Example:**  
**Input:** `nums = [3,4,9,1,3,9,5]`, `key = 9`, `k = 1`  
**Output:** `[1,2,3,4,5,6]`  

**Explanation:**  
- Index 2 and 5 are where `nums[j] == key`  
- From index 2, nearby indices: `[1,2,3]`  
- From index 5, nearby indices: `[4,5,6]`  
- Combined and sorted: `[1,2,3,4,5,6]`

---

## 🧠 Intuition  
Instead of checking every index one by one, it's smarter to work backwards:  
➤ Find all positions `j` where `nums[j] == key`  
➤ For each, mark every index `i` in range `[j - k, j + k]` as valid  
This ripple-like propagation greatly reduces unnecessary checks.

---

## 🛠️ Approach  
1. **Iterate** through `nums` and collect all positions with `nums[i] == key`.  
2. For each key index, **mark all positions in `[i - k, i + k]`** within bounds.  
3. Use a `Set` to avoid duplicates.  
4. Convert the set to a **sorted List** and return.

---

## ⏱️ Time Complexity  
- **O(n + m log m)** – where n is the array length and m is number of marked indices

## 🗂️ Space Complexity  
- **O(m)** – for storing the unique indices
