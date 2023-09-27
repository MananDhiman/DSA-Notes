Time Complexity - O (log n)
```java
public int search(int[] nums, int target) {

  if(nums.length == 1) return nums[0] == target ? 0 : -1;
  
  return bSearch(nums, target, 0, nums.length-1);
}

public int bSearch(int[] nums, int target, int low, int high) {
  if(high - low == 1) {
    if(nums[high] == target) return high;
    if(nums[low] == target) return low;
    else return -1;
  }

  int mid = (high + low) / 2;

  if(target == nums[mid]) return mid;
  if(target < nums[mid]) return bSearch(nums, target, low, mid);

  return bSearch(nums, target, mid, high);
}
```