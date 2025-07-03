# Find the K-th Character in String Game I

## 🧩 Problem  
Alice and Bob are playing a game. Initially, Alice has a string `word = "a"`.

Bob repeatedly asks Alice to perform the following operation:

> Generate a new string by changing each character in `word` to its next character in the English alphabet (wrapping around from `'z'` to `'a'`), and append it to the original word.

Return the value of the **k-th character** in the resulting string after enough operations have been performed to ensure the string has at least `k` characters.

**Example:**  
**Input:** `k = 5`  
**Output:** `"b"`  

**Explanation:**  
- Start with `"a"`  
- After 1st operation: `"a"` → `"ab"`  
- After 2nd operation: `"ab"` → `"abbc"`  
- After 3rd operation: `"abbc"` → `"abbcbccd"`  
- The 5th character is `"b"`

---

## 🧠 Intuition  
Each operation doubles the string length by appending the "next character" version of the current string.  
To find the k-th character, we simulate this process until the string reaches length ≥ k.

---

## 🛠️ Approach  
1. Start with a `StringBuilder` initialized to `"a"`.  
2. While the string length is less than `k`, do the following:
   - For each character in the current string, compute its next character (with `'z'` wrapping to `'a'`).
   - Append the resulting characters to the string.
3. Return the character at index `k - 1`.

---

## ⏱️ Time Complexity  
- **O(k)** in the worst case, since we may need to build up to `k` characters.

## 🗂️ Space Complexity  
- **O(k)** – storing the generated string up to length `k`.

---

## 📌 Notes  
- This brute-force approach works well for small values of `k`.  
- For large `k`, consider optimizing using mathematical patterns in the transformation process.

---
