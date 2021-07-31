# Queue-via-stacks
Creating a queue class that is implemented by two stacks

The first stack will be used to push elements onto. THe second stack will be used when it's time to dequeue.
Whenever you need to dequeue, pop all elements from the first stack onto the second stack, now they will be stored in FIFO order. As long as the 2nd stack isn't empty, pop from the 2nd stack.
