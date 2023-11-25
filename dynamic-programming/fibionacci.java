import java.util.HashMap;

class Main {
  static HashMap<Integer, Integer> map = new HashMap<>();

  static int fib(int num) {
    if(num <= 1) return num;
    else if(num == 2) return 1;

    // using Dynamic programming
  
    if(map.containsKey(num)) {
      return map.get(num);
    } else {
      int fib = fib(num-1) + fib(num-2);

      map.put(num, fib);
      return fib;
    }

    // using simple recursion
    // return fib(num-1) + fib(num-2);
    
  }
  public static void main(String[] args) {
    for(int i=10; i<=200; i++ ) System.out.println(i + " " + fib(i));
    
  }
}