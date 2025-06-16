# Maximum Difference Between Increasing Elements

## 🧩 Problem  
You are given a 0-indexed integer array `nums` of size `n`.  
Find the **maximum difference** between `nums[j] - nums[i]` such that `0 <= i < j < n` and `nums[i] < nums[j]`.

If no such pair exists, return `-1`.

**Example:**  
**Input:** `nums = [7,1,5,4]`  
**Output:** `4`  
**Explanation:** Pick `i = 1`, `j = 2`, `nums[j] - nums[i] = 5 - 1 = 4`.

---

## 🧠 Intuition  
To maximize the difference between two increasing elements, we need to:
- Track the **smallest value seen so far** while traversing the array.
- At every step, check if the current number is greater than the minimum.
  - If yes, calculate the difference and update the answer if it's larger.
  - If not, update the minimum since a smaller value may help maximize the difference with future elements.

This approach ensures we only compare elements where `i < j` and `nums[i] < nums[j]`.

---

## 🛠️ Approach  
1. Initialize `min` with the first element of the array.
2. Set `ans = -1` to handle the case when no increasing pair exists.
3. Loop from index `1` to `n - 1`:
   - If `nums[i] < min`, update `min = nums[i]`.
   - If `nums[i] > min`, update `ans = max(ans, nums[i] - min)`.
4. Return `ans`.

---

## ⏱️ Time Complexity 
- **O(n)** - Single traversal of the array. 

## 🗂️ Space Complexity 
- **O(1)** - Constant extra space.
