class Solution {
    public int[] countBits(int n) {
        int arr[] = new int[n+1];
        for(int i=0;i<=n;i++) {
            int cnt = 0;
            for(int j=0;j<32;j++) {
                cnt += (1 & ((i)>>j));
            }
            arr[i] = cnt;
        }
        return arr;
    }
}
