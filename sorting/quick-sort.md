```java
class QuickSort {
  static void swap(int[] arr, int a, int b) {
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }
  static int getPartIndex(int[] arr, int low, int high) {
    int l = low, r = high;
    int pivot = arr[low];

    while(l < r) {
      while(arr[l] <= pivot && l <= high-1) {
        l++;
      }

      while(arr[r] > pivot && r >= low + 1) {
        r--;
      }
      if(l < r) swap(arr, l, r);
    }
    swap(arr, low, r);

    return r;

  }
  static void mSort(int[] arr, int low, int high) {
    if(low < high) {
      int partIndex = getPartIndex(arr, low, high);
      mSort(arr, low, partIndex - 1);
      mSort(arr, partIndex + 1, high);
    }
  }
  public static void main(String args[]) {
    int[] arr = {5,4,3,2,1};

    mSort(arr, 0, arr.length-1);

    for(int i: arr) System.out.print(i + " ");
  }
}
```