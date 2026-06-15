class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set<Integer> st = new HashSet<>();
        for(int num: nums) {
            st.add(num);
        }

        int mx = 1;
        for(int num: st) {
            if(!st.contains(num-1)) {
                int cnt = 1;
                int n = num;
                while(st.contains(n+1)) {
                    cnt++;
                    n++;
                }
                mx = Math.max(mx, cnt);
            }
        }

        return mx;
    }
}
