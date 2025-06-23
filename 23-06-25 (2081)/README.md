# Sum of the k-Mirror Numbers

## 🧩 Problem  
A **k-mirror number** is a positive integer that reads the same both forward and backward in base-10 **and** in base-`k`.  
Given a base `k` and a number `n`, return the **sum of the n smallest k-mirror numbers**.

**Example:**  
**Input:** `k = 2`, `n = 5`  
**Output:** `25`  
**Explanation:** The first 5 k-mirror numbers are: `1, 3, 5, 7, 9`.

---

## 🧠 Intuition  
The brute-force way of checking all numbers wastes time. Instead, we can:
- **Generate palindromes** in base-10 systematically.
- **Check if each** is also a palindrome in base-`k`.
By narrowing our search space to only decimal palindromes, we speed up the search.

---

## 🛠️ Approach  
1. Use a helper function `createPalindrome()` to build decimal palindromes.
   - Supports both **odd-** and **even-length** cases.
2. Use `isPalindrome()` to check if a number is palindromic in base-`k`.
   - Converts the number to base-`k` and checks its reverse.
3. Keep count of how many valid k-mirror numbers we've found.
4. Continue until we've summed the first `n` valid ones.

---

## 🔎 Key Methods  
- `createPalindrome(long num, boolean odd)`: Mirrors digits to form a palindromic number.
- `isPalindrome(long num, int base)`: Validates if a number is palindromic in a given base.

---

## ⏱️ Time Complexity  
- **O(n log n)** – As palindromes grow, we check base-`k` validity for increasingly larger numbers.

## 🗂️ Space Complexity  
- **O(log n)** – Required for temporary string conversion and recursion stack depth.
