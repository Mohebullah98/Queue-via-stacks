import java.util.*;
class MyQueue{
  Stack<Integer> s1 = new Stack<Integer>();
  Stack<Integer> s2 = new Stack<Integer>();

  public void push(int data){
    s1.push(data);
  }
  public int pop(){
    if(s2.size()>0){//s2 keeps track of elements in FIFO, need to pop s2 if it's not empty
      return s2.pop();
    }
    while(s1.size()>0){//if s2 is empty then push all elements from s1 to s2
      s2.push(s1.pop());//they will now be stored in reverse, which is the order for a queue
    }
    return s2.pop();
  }
  public int size(){
    return s1.size()+s2.size();
  }
  public int peek(){//same technique as pop
    if(s2.size()>0){
      return s2.peek();
    }
    else{
      while(s1.size()>0){
        s2.push(s1.pop());
      }
      return s2.peek();
    }
  }
}