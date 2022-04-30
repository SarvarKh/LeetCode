class MyQueue {
    Stack<Integer> pushS = new Stack<>();
    Stack<Integer> popS = new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        pushS.push(x);
    }
    
    private void convertPushSToPopS() {
        int size = pushS.size();
        for (int i=0; i<size; i++) {
            Integer top = pushS.pop();
            popS.push(top);
        }
    }
    
    public int pop() {
        if(popS.isEmpty()) {
            convertPushSToPopS();
        }
        return popS.pop();
    }
    
    public int peek() {
        if(popS.isEmpty()) {
            convertPushSToPopS();
        }
        return popS.peek();
    }
    
    public boolean empty() {
        return pushS.isEmpty() && popS.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */