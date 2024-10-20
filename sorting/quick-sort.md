```java
class QuickSort {
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

public static void sort(int[] arr, int low, int high) {
   if (low >= high) return;

   int l = low, r = high;
   int pivot = arr[low];

   while (l < r && l <= high && r >= low ) {
       while (l < high && arr[l] <= pivot) 
           l++;
       while (r > low && arr[r] > pivot)
           r--;

       if (l < r)
           swap(arr, l, r);
   }

   swap(arr, low, r);

   sort(arr, low, l-1);
   sort(arr, l, high);
}

    public static void main(String args[]) {
        int[] arr = {5,4,3,2,1};

        sort(arr, 0, arr.length-1);

        for(int i: arr)
            System.out.print(i + " ");
    }
}
```