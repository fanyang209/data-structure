class MyQueue {
    // Push element x to the back of queue.
    
        Stack<Integer> queue1 = new Stack();
        Stack<Integer> queue2 = new Stack();
        
    public void push(int x) {
        
        if (queue1.isEmpty()){
            while (!queue2.isEmpty()){
                queue1.push(queue2.pop());
            }
        }
        queue1.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        
         
         while (!queue1.isEmpty()){
            queue2.push(queue1.pop());
        }

         queue2.pop();
    }

    // Get the front element.
    public int peek() {
        while(!queue1.isEmpty()){
            queue2.push(queue1.pop());
        }
        
        return queue2.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        if(queue1.isEmpty() && queue2.isEmpty())
        return true;
        
        return false;
    }
}