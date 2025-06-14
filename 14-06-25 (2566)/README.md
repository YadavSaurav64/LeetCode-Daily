# Maximum Difference by Remapping a Digit

## 🧩 Problem
You're given an integer `num`.Bob will remap **one digit** (from 0 to 9) to **another digit**(also from 0 to 9).This replacement affects **every occurance** of that digit in `num`.

Your task is to :

- Find the **maximum number** that can be obtained by remapping one digit.
- Find the **minimum number** that can be obatined by remapping one digit.
- Return the **difference** between these two numbers.

**Example:**
Input: num = `11891`

Output: `99009`

Explanation:To achieve the maximum value, Bob can remap the digit 1 to the digit 9 to yield **99899**.

To achieve the minimum value, Bob can remap the digit 1 to the digit 0, yielding **890**.

The difference between these two numbers is **99009**.

---

## 🧠 Intuition
- To maximize the number, replace a smaller digit with `9`, since it's the highest possible digit.
- Start from the left and pick the **first digit that is not 9**—this change has the most impact on the magnitude.
- To minimize the number, replace the **first digit** (whatever it is) with 0, which is the smallest digit
- All occurrences of the selected digit should be changed, not just one.
- Converting the number to a string makes it easier to manipulate each digit and perform replacements.
- Then after remapping converting them back into integers.
- At the end returing the difference between maximum and minimum.

---

## 🛠️ Approach
1. Convert `num` to a string to access each digit individually
2. For the **maximum value**:
   - Traverse the string from the start.
   - Find the first digit that is not `'9'`.
   - Replace all occurrences of that digit with `'9'`.
3. For the **minimum value**:
   - Take the first digit (whatever it is).
   - Replace all of its occurrences with `'0'`.
4. Convert the two remapped strings back to integers.
5. Return the difference between the max and min numbers.

---

## ⏱️ Time Complexity
- **O(n)** - where `n` is the number of digits in `num`. We iterate over the digitd a few times for replacement.

## 🗂️ Space Complexity
- **O(n)** - due to stroing two versions of string (`s` and `t`).
