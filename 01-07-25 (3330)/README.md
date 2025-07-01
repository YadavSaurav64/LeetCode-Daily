# Find the Original Typed String I

## 🧩 Problem  
Alice is typing a string, but she may have accidentally held down a key for too long, causing a character to be repeated multiple times.  
She believes this might have happened **at most once**.

You're given a string `word` representing the final output on her screen.  
Return the **total number of possible original strings** Alice might have intended to type.

**Example:**  
**Input:** `word = "abbcccc"`  
**Output:** `5`  

**Explanation:**  
The possible original strings are:  
- `"abbcccc"` (no correction)  
- `"abbccc"` (remove one `'c'`)  
- `"abbcc"` (remove two `'c'`)  
- `"abbc"` (remove three `'c'`)  
- `"abcccc"` (remove one `'b'`)  

Only one group of repeated characters can be shortened.

---

## 🧠 Intuition  
Since Alice may have held down a key only once, we can only shorten **one group** of consecutive repeated characters.  
So, the number of possible original strings is equal to the **length of the longest group of repeated characters** — we can remove 0 to (length - 1) characters from that group.

---

## 🛠️ Approach  
1. Initialize a counter `ans = 1` (the original string is always valid).  
2. Traverse the string and track groups of consecutive repeated characters.  
3. For each group, count its length.  
4. The maximum group length determines how many variations we can create by shortening that group.  
5. Return the length of the longest group as the answer.

---

## ⏱️ Time Complexity 
- **O(n)** – single pass through the string

## 🗂️ Space Complexity
- **O(1)** – constant extra space
