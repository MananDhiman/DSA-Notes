```java
public class SelectionSort {
  public static void main(String[] args) {
    int[] arr = {5,4,3,2,1};

    // find smallest, place at first
    for(int i = 0; i< arr.length; i++) {
      int smallest = arr[i], smallestIndex = i;

      for(int j = i+1; j< arr.length; j++) {
        if(smallest > arr[j]) {
          smallest = arr[j];
          smallestIndex = j;
        }
      }

      int temp = arr[i];
      arr[i] = smallest;
      arr[smallestIndex] = temp;
    }

    for(int i: arr) System.out.println(i);
  }
}
```