# 🔠 Divide a String Into Groups of Size k

## 🧩 Problem  
Given a string `s`, an integer `k`, and a character `fill`, divide `s` into groups of size `k`.  
If the last group contains fewer than `k` characters, append the `fill` character until the group has size `k`.

Return a string array where each element is one group.

**Example:**  
**Input:** `s = "abcdefghi"`, `k = 3`, `fill = 'x'`  
**Output:** `["abc", "def", "ghi"]`  
**Explanation:** The string is already perfectly divisible into three parts of size 3, so no fill is needed.

---

## 🧠 Intuition  
We need to split the input string into chunks of `k` characters, padding the final group if needed.

To do this:
- Traverse the string and collect characters into a temporary group.
- Once the group reaches size `k`, store it and reset.
- After the full pass, if the last group is smaller than `k`, use the `fill` character to pad it.

This ensures each group is exactly of size `k`, and their concatenation (after trimming fills) reconstructs the original string.

---

## 🛠️ Approach  
1. Initialize a result array of appropriate size.
2. Traverse the string with an index `i` while tracking the current group:
   - Add characters one by one until the group size hits `k`.
   - Store the group in the result array and reset the builder.
3. If the end of string is reached mid-group:
   - Append `fill` characters to complete the group.
   - Store the final group.
4. Return the result array.

---

## ⏱️ Time Complexity  
- **O(n)** — Traverse all characters of the string exactly once.

## 🗂️ Space Complexity  
- **O(n/k)** — Output space for `n/k` groups, plus minor space for intermediate operations.
