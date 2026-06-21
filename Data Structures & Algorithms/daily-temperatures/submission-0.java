class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];

        Stack<int[]> st = new Stack<>();
        for(int i=0;i<n;i++) {
            int t = temperatures[i];
            while(!st.isEmpty() && t > st.peek()[0]) {
                ans[st.peek()[1]] = i - st.peek()[1];
                st.pop();
            }
            st.push(new int[]{t, i});
        }

        while(!st.isEmpty()) {
            ans[st.peek()[1]] = 0;
            st.pop();
        }

        return ans;
    }
}
