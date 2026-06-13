class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int num: nums) {
            if(mp.containsKey(num)) {
                mp.put(num, mp.get(num)+1);
            } else {
                mp.put(num, 1);
            }
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        for(Map.Entry<Integer, Integer> entry: mp.entrySet()) {
            pq.offer(new int[]{entry.getValue(), entry.getKey()});
        }

        int i = 0, ans[] = new int[k];
        while(k-- > 0) {
            ans[i++] = pq.poll()[1];
        }
        return ans;
    }
}
