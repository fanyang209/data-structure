class MyStack {
    
    Queue queue1 = new LinkedList();
    Queue queue2 = new LinkedList();
    
    // Push element x onto stack.
    public void push(int x) {
        if(queue1.isEmpty()){
            while(!queue2.isEmpty()){
               queue1.add(queue2.poll()); 
            }
        }
        
        queue1.add(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        if(queue1.isEmpty()){
            while(queue2.size() > 1){
                queue1.add(queue2.poll());
            }
            queue2.poll();
        }else if(queue2.isEmpty()){
            while(queue1.size() > 1){
                queue2.add(queue1.poll());
            }
            queue1.poll();
        }
    }
 
    // Get the top element.
    public int top() {
        if(queue1.isEmpty()){
            while(queue2.size() > 1){
                queue1.add(queue2.poll());
            }
            int peek = (int)queue2.peek();
             queue1.add(queue2.poll());
             return peek;
        }else if(queue2.isEmpty()){
            while(queue1.size() > 1){
                queue2.add(queue1.poll());
            }
            
            int peek = (int)queue1.peek();
             queue2.add(queue1.poll());
             return peek;
           
        }
        return 0;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }
}