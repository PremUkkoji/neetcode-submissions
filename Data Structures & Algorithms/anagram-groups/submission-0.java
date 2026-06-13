class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();
        for(String str: strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String ss = new String(arr);

            if(!mp.containsKey(ss)) {
                mp.put(ss, new ArrayList<>(List.of(str)));
            } else {
                mp.get(ss).add(str);
            }
        }

        List<List<String>> ans = new ArrayList<List<String>>();
        for(List<String> lstr: mp.values()) {
            ans.add(lstr);
        }
        return ans;
    }
}
