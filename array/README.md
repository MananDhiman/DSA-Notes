# Array
* Homogenous data, 
* each element in continuous memory locations
* fixed length
* each element unique index

## 2D Array
a[i][j]: i row, j column

## Find Missing Number In Array
Write Java function called findMissingNumberInArray that takes an integer array containing n-1 unique elements from a range of 1 to n, with one missing number, and returns the missing number.
### Two Methods
1. **Sort**: First sort, then linear search and find missing element
2. **Math formula sum of n numbers**: (n(n+1)/2). Calculate sum of n numbers, then calculate sum of numbers of array, the difference is the missing number
