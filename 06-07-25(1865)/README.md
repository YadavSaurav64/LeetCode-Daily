# Finding Pairs With a Certain Sum

## 🧩 Problem

You are given two integer arrays `nums1` and `nums2`. Your task is to implement a data structure that supports two types of queries:

1. Add a positive integer to an element at a given index in `nums2`.
2. Count the number of pairs `(i, j)` such that `nums1[i] + nums2[j] == tot`.

Implement the `FindSumPairs` class:

- `FindSumPairs(int[] nums1, int[] nums2)`  
  Initializes the object with two integer arrays.

- `void add(int index, int val)`  
  Adds `val` to `nums2[index]`.

- `int count(int tot)`  
  Returns the number of pairs `(i, j)` such that `nums1[i] + nums2[j] == tot`.

**Example:**

**Input:** `["FindSumPairs", "count", "add", "count", "count", "add", "add", "count"]`
            `[[[1, 1, 2, 2, 2, 3], [1, 4, 5, 2, 5, 4]], [7], [3, 2], [8], [4], [0, 1], [1, 1], [7]]`  
**Output:** `[null, 8, null, 2, 1, null, null, 11]`  
**Explanation:** FindSumPairs findSumPairs = new FindSumPairs(`[1, 1, 2, 2, 2, 3], [1, 4, 5, 2, 5, 4]`);

findSumPairs.count(7);  // return 8; pairs `(2,2), (3,2), (4,2), (2,4), (3,4), (4,4)` make `2 + 5` and pairs `(5,1), (5,5) make 3 + 4`

findSumPairs.add(3, 2); // now nums2 = `[1,4,5,4,5,4]`

findSumPairs.count(8);  // return 2; pairs `(5,2), (5,4) make 3 + 5`

findSumPairs.count(4);  // return 1; pair `(5,0) makes 3 + 1`

findSumPairs.add(0, 1); // now nums2 = `[2,4,5,4,5,4]`

findSumPairs.add(1, 1); // now nums2 = `[2,5,5,4,5,4]`

findSumPairs.count(7);  // return 11; pairs `(2,1), (2,2), (2,4), (3,1), (3,2), (3,4), (4,1), (4,2), (4,4) make 2 + 5 and pairs (5,3), (5,5) make 3 + 4`

--- 

## 🧠 Intuition

- Use a frequency map for nums2 to speed up lookups.
- For count(tot), find how many times (tot - num1) appears in nums2.
- Update the map on every add(index, val) call.
- Avoids nested loops → faster queries.

## 🛠️ Approach

1. Store `nums1` and `nums2` as instance variables.
2. Build a frequency map for `nums2` to track the count of each number.
3. In `add(index, val)`:
   - Decrease the count of the old value in the map.
   - Update the value in `nums2`.
   - Increase the count of the new value in the map.
4. In `count(tot)`:
   - For each number in `nums1`, compute the complement needed from `nums2`.
   - Use the frequency map to count how many such complements exist.

---

## ⏱️ Time Complexity

- `add`: **O(1)** – constant time update to the frequency map.
- `count`: **O(n)** – where `n` is the length of `nums1`.

## 🗂️ Space Complexity

- **O(m)** – where `m` is the number of unique elements in `nums2` (for the frequency map).
