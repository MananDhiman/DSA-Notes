# Time Complexity

Θ - Avg Case

Ω - Best Case

O - Worst Case

## Big O

Metric used to describe efficiency of algo. How time for execution grows as input of size grows.

## O(log N)
When controlling param divided by 2 in each step

If 1 mil. items in array, and we use binary search,
`log(2)1048576 = 20` steps

If 256 items:
`log(2)256 = 7` steps

# Data Structures

(Worst Case)
| Data Structure | Access | Search | Insertion | Deletion |
|----------------------|----------|----------|-----------|----------|
| Array | 0(1) | 0(N) | 0(N) | 0(N) |
| Stack | 0(N) | 0(N) | 0(1) | 0(1) |
| Queue | 0(N) | 0(N) | 0(1) | 0(1) |
| Singly Linked List | 0(N) | 0(N) | 0(N) | 0(N) |
| Double Linked List | 0(N) | 0(N) | 0(1) | 0(1) |
| Hash Table | 0(N) | 0(N) | 0(N) | 0(N) |
| Binary (Search) Tree | 0(N) | 0(N) | 0(N) | 0(N) |
| AVL Tree | 0(log N) | 0(log N) | 0(log N) | 0(log N) |

# Sorting Algos

| Sorting Algorithm | Worst Time | Worst Space | Best       |
| ----------------- | ---------- | ----------- | ---------- |
| Selection         | 0(n^2)     | 0(1)        | Ω(n^2)     |
| Bubble            | 0(n^2)     | 0(1)        | Ω(n)       |
| Insertion         | 0(n^2)     | 0(1)        | Ω(n)       |
| Heap              | 0(n log n) | 0(1)        | Ω(n log n) |
| Quick             | 0(n^2)     | 0(n)        | Ω(n log n) |
| Merge             | 0(n log n) | 0(n)        | Ω(n log n) |
| Bucket            | 0(n^2)     | 0(n)        | Ω(n + k)   |
| Radix             | 0(nk)      | 0(n + k)    | Ω(nk)      |

![time-complexity-chart](https://github.com/MananDhiman/comp-sci-theory/assets/64782929/b225d69f-94c4-44f4-a12a-5d0e7f766dec)

# Leetcode Hint
n < 20 = 2 ^ n, n! (brute force / backtracking)
n < 3k = n ^ 2  (dynamic programming)
n < 10 ^ 6 = linear, n logn (2 pointer, greedy, heap , sorting)
n > 10 ^ 6 = logn, constant (binary search, math)