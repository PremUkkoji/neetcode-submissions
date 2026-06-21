class MinStack {

    List<Integer> arr;
    Stack<Integer> minSt;

    public MinStack() {
        arr = new ArrayList<>();
        minSt = new Stack<>();
    }
    
    public void push(int val) {
        arr.add(val);
        minSt.push(Math.min(minSt.isEmpty() ? Integer.MAX_VALUE : minSt.peek(), val));
    }
    
    public void pop() {
        if(arr.size() > 0) {
            arr.remove(arr.size() - 1);
            minSt.pop();
        }
    }
    
    public int top() {
        if(arr.size() > 0) return arr.get(arr.size() - 1);
        else return -1;
    }
    
    public int getMin() {
        return minSt.peek();
    }
}
