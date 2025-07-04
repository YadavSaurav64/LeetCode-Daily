# Find the K-th Character in String Game II

## 🧩 Problem

Alice and Bob are playing a game. Initially, Alice has a string `word = "a"`.

You're given a positive integer `k` and an integer array `operations`, where each `operations[i]` represents one of two operations:

- If `operations[i] == 0`: Append a copy of the current string to itself.
- If `operations[i] == 1`: Shift each character in the current string to its next character in the English alphabet (with `'z'` wrapping around to `'a'`), and append the result to the original string.

Return the **k-th character** in the final string after performing all operations.

⚠️ The final string can grow exponentially large, so direct simulation is not feasible.

**Example:**

**Input:**  
`k = 5`, `operations = [0, 0, 0]`  
**Output:**  
`"a"`

**Explanation:**
- Start with `"a"`
- After 1st operation: `"aa"`
- After 2nd operation: `"aaaa"`
- After 3rd operation: `"aaaaaaaa"`
- The 5th character is `'a'`

---

## 🧠 Intuition

- The string becomes very big after each operation, so we can't build it fully.
- Each operation doubles the string:
  - Type 0: add the same string again.
  - Type 1: add a shifted version of the string.
- We don’t need the full string — just the k-th character.
- We go backward from position k to find where it came from.
- If it came from a type-1 operation, we count one shift.
- In the end, we return `'a'` shifted by the total number of shifts.---

## 🛠️ Approach

1. Initialize a counter `ans = 0` to track how many type-1 operations affect the k-th character.
2. While `k > 1`:
   - Find the highest power of 2 less than `k` to determine the operation level.
   - Adjust `k` to trace back to its origin in the previous string.
   - If the operation at that level was type-1, increment the shift counter.
3. Return `'a' + (ans % 26)` as the final character.

---

## ⏱️ Time Complexity

- **O(log k)** – We reduce `k` by the highest power of 2 in each step.

## 🗂️ Space Complexity

- **O(1)** – Constant space used for counters and calculations.
