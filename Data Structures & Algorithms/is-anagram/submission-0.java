class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> mp = new HashMap<Character, Integer>();
        for(char ch: s.toCharArray()) {
            if(mp.containsKey(ch)) {
                mp.put(ch, mp.get(ch) + 1);
            } else {
                mp.put(ch, 1);
            }
        }

        for(char ch: t.toCharArray()) {
            if(mp.containsKey(ch)) {
                mp.put(ch, mp.get(ch) - 1);
            } else {
                return false;
            }
        }

        for (Integer value : mp.values()) {
            if(value != 0) return false;
        }
        return true;
    }
}
