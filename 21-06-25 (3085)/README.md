#  Minimum Deletions to Make String k-Special

## 🧩 Problem  
You're given a string `word` and an integer `k`. A string is called **k-special** if the absolute difference between the frequencies of *any two characters* in the string is **less than or equal to `k`**.  

Return the **minimum number of deletions** needed to make the string k-special.

**Example:**  
**Input:** `word = "aabcaba"`, `k = 0`  
**Output:** `3`  
**Explanation:** Deleting 2 `'a'`s and 1 `'c'` results in `"baba"` where `freq('a') = freq('b') = 2`.

---

## 🧠 Intuition  
We want to bring the frequency of all characters close together, where the difference between any two is `≤ k`.

To achieve that, we can:
- Use a frequency array of size 26 to store counts of each character.
- For each existing character frequency, consider it as a **baseline** and try adjusting others accordingly:
  - If another character's frequency is too small, we delete all its occurrences.
  - If it's too large (i.e., exceeds baseline + k), delete the extras to bring it into range.
- Repeat this process for all non-zero frequencies as potential baselines.

Keep track of the **minimum number of deletions** encountered during this process.

---

## 🛠️ Approach  
1. Count frequency of each character (26-letter array).
2. For each character with non-zero frequency:
   - Assume it's our baseline `a`.
   - For all characters:
     - If `freq[j] < a`: delete all of them.
     - If `freq[j] > a + k`: delete `freq[j] - (a + k)` chars.
3. Calculate total deletions for this setup.
4. Update the result with the minimum deletions seen.
5. Return the final answer.

---

## ⏱️ Time Complexity  
- **O(n)** = iterating through the array to store frequency

## 🗂️ Space Complexity  
- **O(1)** constant space for the frequency array.
