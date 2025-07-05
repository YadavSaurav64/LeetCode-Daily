# Find Lucky Integer in an Array

## 🧩 Problem

Given an array of integers `arr`, a lucky integer is an integer whose frequency in the array is equal to its value.

Return the largest lucky integer in the array. If there is no lucky integer, return `-1`.

**Example:**

**Input:** `arr = [2, 2, 3, 4]`  
**Output:** `2`  
**Explanation:** The only lucky number is `2` because it appears exactly `2` times.

---

## 🧠 Intuition

- A lucky number appears exactly as many times as its value.
- Count frequencies using a fixed-size array.
- Check which numbers match their frequency.
- Track the largest such number.
---

## 🛠️ Approach

1. Create a frequency array of size 501 (since `1 <= arr[i] <= 500`).
2. Count the frequency of each number in the input array.
3. Iterate through the array again:
   - If a number's frequency equals its value, it's a lucky number.
   - Track the maximum such lucky number.
4. Return the largest lucky number found, or `-1` if none exist.

---

## ⏱️ Time Complexity

- **O(n)** – where `n` is the length of the input array

## 🗂️ Space Complexity

- **O(1)** – constant space (fixed-size frequency array)
