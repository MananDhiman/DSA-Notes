class factorial {

  static long[] dp;

  static long fact(int num) {
    if(num == 0) return 1;
    else if(num == 1) return 1;

    // using dp
    if(dp[num] != 0) 
      return dp[num];
    else {
      long factorial = num * fact(num-1);
      dp[num] = factorial;
      return factorial;
    }

    // normal recursion
    // return num * fact(num-1);
  }
  public static void main(String[] args) {
    int num = 5000;
    dp = new long[num];

    for(int i=0; i<num; i++) {
      System.out.println(i + " "+fact(i));

    }
  }
  
}
