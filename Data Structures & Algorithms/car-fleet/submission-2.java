class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        List<int[]> data = new ArrayList<>();
        for(int i=0;i<n;i++) {
            data.add(new int[]{position[i], speed[i]});
        }

        Collections.sort(data, (a, b) -> b[0] - a[0]);

        Stack<Double> st = new Stack<>();
        for(int i=0;i<n;i++) {
            st.push((target-data.get(i)[0]*1.0)/data.get(i)[1]);
            if(st.size() >= 2) {
                double top = st.pop();
                if(top > st.peek()) {
                    st.push(top);
                }
            }
        }

        return st.size();
    }
}
