```java
import java.util.ArrayList;

public class MergeSort {
  static void merge(int[] arr, int l, int mid, int r) {
    ArrayList<Integer> list = new ArrayList<>();

    int low = l;
    int i = mid + 1;
    while(l <= mid && i<= r) {
      if(arr[l] < arr[i]) {
        list.add(arr[l]);
        l++;
      }
      else if(arr[l] > arr[i]) {
        list.add(arr[i]);
        i++;
      }
      else {
        list.add(arr[i]);
        list.add(arr[i]);

        i++;
        l++;
      }
    }

    while(l <= mid) {
      list.add(arr[l]);
      l++;
    }

    while(i <= r) {
      list.add(arr[i]);
      i++;
    }

    int it = low;
    for(int val: list) {
      arr[it] = val;
      it++;
    }
  }
  static void mergeSort(int[] arr, int l, int r) {
    if(l == r) return;

    int mid = (l+r) / 2;

    mergeSort(arr, l, mid);
    mergeSort(arr, mid+1, r);

    merge(arr, l, mid, r);
  }
  public static void main(String[] args) {
    int[] arr = {67,7,57,472,22,1};
    mergeSort(arr, 0, arr.length-1);

    for(int i: arr) System.out.println(i);
  }
}
```