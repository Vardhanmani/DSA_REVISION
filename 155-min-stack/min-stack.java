class MinStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;
    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int value) {
        mainStack.push(value);
        if(minStack.isEmpty() || value <= minStack.peek()){
            minStack.push(value);
        }
    }
    
    public void pop() {
        int remove = mainStack.pop();
        if(remove == minStack.peek()){
            minStack.pop();
        }
    }
    
    public int top() {
        int num = mainStack.peek();
        return num;
    }
    
    public int getMin() {
        int num2 = minStack.peek();
        return num2;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */