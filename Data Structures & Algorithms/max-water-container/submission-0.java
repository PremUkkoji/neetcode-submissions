class Solution {
    public int maxArea(int[] heights) {
        int i=0, j=heights.length-1;
        int mx = 0;
        while(i<j) {
            int curr = (j-i) * Math.min(heights[i], heights[j]);
            mx = Math.max(mx, curr);
            if(heights[i] < heights[j]) {
                i++;
            } else {
                j--;
            }
        }
        return mx;
    }
}
