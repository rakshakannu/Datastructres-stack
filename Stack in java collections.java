import java.util.*;
import java.util.Stack;

class test{
  public static void main(String args[])
  {
    Stack<Integer> s = new Stack<Integer>();
    s.push(5)  // pushing an element
    while(s.isEmpty()==false)
      System.out.println(s.pop());  // pop an element
    
    System.out.println(s.size()); // returns the size of stack
    System.out.println(s.peek()); // returns the top element of the stack
  }
}

// there is also search() function that is rarely used. returns the position of element w.r.t the top element in the stack. for ex- the 
// topmost element position will be 1, and if element not present in the stack, it will return -1.
