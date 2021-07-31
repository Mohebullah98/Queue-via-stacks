class Main {
  public static void main(String[] args) {
    int a=15;
    int b=20;
    int c=2;
    int d=4;
    int e=40;
    MyQueue q = new MyQueue();
    q.push(a);
    q.push(b);
    q.push(c);
    q.push(d);
    q.push(e);
    System.out.println("Queue size is: " +q.size());
    System.out.print("First item to be dequeued is: "+q.pop()+ "\nSecond item is: "+q.pop() + "\nThird item is: "+q.pop());
  }
}