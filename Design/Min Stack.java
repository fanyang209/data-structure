class MinStack {
    
    Stack<Integer> origiStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    
    public void push(int x) {
        
        origiStack.push(x);
        if(minStack.isEmpty()){
            minStack.push(x);
        }else if(x < minStack.peek() ||x == minStack.peek() ){
            minStack.push(x);
        }
    }

    public void pop() {
        
        int top = origiStack.pop();
        if(top == minStack.peek()){
            minStack.pop();
        }
    }

    public int top() {
        return origiStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
