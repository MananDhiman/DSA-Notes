public class Stack{
  int[] arr;
  int top;

  Stack(int size) {
    this.arr = new int[size];
    top = -1;
  }

  void push(int num) {
    
    if(!this.isFull()) {
      top++;
      this.arr[top] = num;
      System.out.println(num+" added");
    } else {
      System.out.println("Stack Full so cannot push");
    }
    this.displayStack();
  }

  void pop() {
    if(!this.isEmpty()) {
      System.out.println(this.arr[top] + " is popped");
      top--;
    } else {
      System.out.println("Stack empty so cannot pop");
    }
    this.displayStack();
  }

  boolean isFull() {
    return this.top == this.arr.length - 1; 
  }

  boolean isEmpty() {
    return this.top == -1 ? true : false;
  }

  void displayStack() {
    for(int i: this.arr) {
      System.out.printf("%d ->", i);
    }
    System.out.println();
  }
  public static void main(String[] args) {
    Stack stack = new Stack(5);
    stack.pop();
    stack.pop();
    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.pop();
    stack.push(40);
    stack.push(400);
    stack.push(4000);

  }
}