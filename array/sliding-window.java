class Main {
  public static void main(String[] args) {
    // find max sub array sum
    // window size = 3
    // find size of first window, loop through array, stop at last index

    int[] arr = {1,2,3,4,5,6,7,8,9,10};
    int k = 3;

    int currSum = 0;
    for(int i=0; i<3; i++) currSum += arr[i];

    int maxSum = currSum;

    for(int i=k; i<arr.length; i++) {
      currSum += arr[i] - arr[i - k];

      maxSum = Math.max(currSum, maxSum);
    }

    System.out.println(maxSum);
  }
}
