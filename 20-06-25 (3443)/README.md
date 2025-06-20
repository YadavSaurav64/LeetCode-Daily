# 🚶‍♂️ Maximum Manhattan Distance with k Changes

## 🧩 Problem  
You are given a string `s` consisting of directions `'N'`, `'S'`, `'E'`, and `'W'`, where each character represents a unit movement in an infinite 2D grid:
- `'N'`: Move north (+1 on y-axis)
- `'S'`: Move south (–1 on y-axis)
- `'E'`: Move east  (+1 on x-axis)
- `'W'`: Move west  (–1 on x-axis)

You start at the origin `(0, 0)`. You are allowed to **change at most `k` characters** in the string to any of the four directions.  
Return the **maximum Manhattan distance** from the origin that can be achieved **at any time during the movement sequence**.

**Example:**  
**Input:** `s = "NWSE"`, `k = 1`  
**Output:** `3`  
**Explanation:** Change `'S'` to `'N'`. Updated sequence: `"NWNE"`  
The furthest Manhattan distance reached is `3`.

---

## 🧠 Intuition  
Each change has the potential to push us further from the origin.  
- Every movement affects the position by `±1` on the x or y axis.
- The Manhattan distance is `|x| + |y|`, so pushing both values in the same direction helps maximize it.
- Each change can add at most `+2` (e.g., flipping a direction like `'S'` to `'N'`).
- But we cannot exceed the number of steps we’ve taken at any point — that's our natural boundary.

---

## 🛠️ Approach  
1. Simulate the movements as per the original string.
2. Track current `x` and `y` coordinates at each step.
3. After each move:
   - Compute the current Manhattan distance: `|x| + |y|`
   - Calculate the potential distance: `min(current + 2 * k, steps taken so far)`
   - Update the answer if this is the maximum so far.

---

## ⏱️ Time Complexity 
- **O(n)** one pass through the string.. 

## 🗂️ Space Complexity
- **O(1)** constant space used.
