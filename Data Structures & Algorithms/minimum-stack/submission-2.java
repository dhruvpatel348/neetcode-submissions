class MinStack {

    private Stack<Integer> stk;
    private Stack<Integer> minStk;

    public MinStack() {
        this.stk = new Stack<>();
        this.minStk = new Stack<>();
    }
    
    public void push(int val) {
        this.minStk.push(val);
        if(!stk.isEmpty()) {
            if(stk.peek() < val) {
                stk.push(stk.peek());
            }
            else {
                stk.push(val);
            }
        }
        else
        stk.push(val);
    }
    
    public void pop() {
        this.minStk.pop();
        this.stk.pop();
    }
    
    public int top() {
       return  this.minStk.peek();
        
    }
    
    public int getMin() {
        return this.stk.peek();
    }
}
