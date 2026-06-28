class Solution {
    int[] prevSmallElement(int[] heights) {
        int n = heights.length;
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = -1;

        Stack<Integer> st = new Stack<>();
        st.push(n-1);

        for(int i=n-2;i>=0;i--) {
            while(!st.isEmpty() && heights[i] < heights[st.peek()]) {
                arr[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }

        return arr;
    }

    int[] nextSmallElement(int[] heights) {
        int n = heights.length;
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = n;

        Stack<Integer> st = new Stack<>();
        st.push(0);

        for(int i=1;i<n;i++) {
            while(!st.isEmpty() && heights[i] < heights[st.peek()]) {
                arr[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }

        return arr;
    }

    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] prevS = prevSmallElement(heights);
        int[] nextS = nextSmallElement(heights);

        int mx = 0;
        for (int i = 0; i < n; i++) {
            int width = nextS[i] - prevS[i] - 1;
            int area = heights[i] * width;
            mx = Math.max(mx, area);
        }
        return mx;
    }
}
