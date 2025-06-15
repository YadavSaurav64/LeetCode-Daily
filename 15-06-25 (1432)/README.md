# Max Difference You Can Get From Changing an Integer

## 🧩 Problem
You are given an integer `num`.You will apply the following steps to `num` **two** separate times:
- Pick a digit `x (0<=x<=9)`.
- Pick another digit `y (0<=y<=9`.Npte `y` can be equal to `x`.
- Replace all the occurance of `x` in the decimal representation of `num` by `y`.

Let `a` and `b` be the two results from applying the operation to `num` independently.
Return the max difference between `a` and `b`.
Note that neither `a` nor `b` may have any leading zeros,and **must not** be 0.

**Example:**

**Input:** num = `555`

**Output:** `888`

**Explanation:** The first time pick `x = 5` and `y = 9` and store the new integer in a.
The second time pick `x = 5` and `y = 1` and store the new integer in b.
We have now `a = 999` and `b = 111` and **max difference = 888**

---

## 🧠 Intuition
- To get the **maximum number**, replace the first digit from the left that is **not `9`** with `9` to increase the value as much as possible.
- To get the **minimum number**:
  - If the first digit is `'1'`, we look for the first digit that is **not `'0'` or `'1'`** and replace all its occurrences with `'0'`.
  - If the first digit is not `'1'`, we simply replace all occurrences of that digit with `'1'`.
- Use strings to easily perform digit-wise replacement.
- After transformation, convert both numbers back to integers and return the difference.

---

## 🛠️ Approach
1. Convert `num` to a string and make a copy of it.
2. **For the minimum number:**
   - If the first character is not `'1'`, replace all its instances with `'1'`.
   - If it is `'1'`, scan for the first character that is neither `'0'` nor `'1'` and replace all its instances with `'0'`.
3. **For the maximum number:**
   - Find the first digit that is not `'9'` and replace all of its instances with `'9'`.
4. Convert both resulting strings back to integers.
5. Return their difference.

---

## ⏱️ Time Complexity
- **O(n)** - where `n` is the number of digits in `num`. We iterate over the digitd a few times for replacement.

## 🗂️ Space Complexity
- **O(n)** - due to stroing two versions of string (`s` and `t`).
