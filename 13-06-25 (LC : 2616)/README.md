# Minimize the Maximum Difference of Pairs

## 🧩 Problem
You are given a 0-indexed integer array nums and an integer p. Find p pairs of indices of nums such that the maximum difference amongst all the pairs is minimized. Also, ensure no index appears more than once amongst the p pairs.

Note that for a pair of elements at the index i and j, the difference of this pair is |nums[i] - nums[j]|, where |x| represents the absolute value of x.

Return the minimum maximum difference among all p pairs. We define the maximum of an empty set to be zero.


**Example:**
Input: nums = `[10, 1, 2, 7, 1, 3]` `p = 2`

Output: `1`

Explanation: We can form the following pairs:

Pair 1 → indices (1, 4) → `|nums[1] - nums[4]|` = `|1 - 1| = 0`

Pair 2 → indices (2, 5) → `|nums[2] - nums[5]|` = `|2 - 3| = 1`

Maximum difference among the selected pairs = `max(0, 1) = 1`

Therefore, the answer is 1.

---

## 🧠 Intuition
- After sorting the array, the absolute differences between adjacent elements are minimized and increase from left to right.
- The goal is to select p non-overlapping pairs such that the largest difference in these pairs is as small as possible.
- We use binary search on the range of possible maximum differences:
- The minimum difference starts at 0
- The maximum difference is nums[n - 1] - nums[0] (since the array is sorted)
- For each mid-value (candidate for max allowed difference), we check whether we can greedily form p valid pairs with differences ≤ mid:
- If we can, we try to reduce the allowed max difference: r = mid
- If we can't, we must allow more difference: l = mid + 1
- When loop ends l holds the value of maximum of minimum diffrences.

---

## 🛠️ Approach
1. Sort nums
2. Set binary search bounds: l = 0, r = nums[n - 1] - nums[0]
3. Use binary search to check for each mid whether p pairs can be formed
4. If possible, reduce the allowed difference range (r = mid); else increase it (l = mid + 1)
5. Return l as the result

---

## ⏱️ Time Complexity
- **O(n logn)** - for sorting

## 🗂️ Space Complexity
- **O(1)** - constant space usage
