class Solution {
    public boolean isAnagram(String s, String t) {

        int slen = s.length();
        int tlen = t.length();
        if(slen != tlen) return false;

        HashMap<Character, Integer> counts = new HashMap<>();

        for(int i = 0; i < slen; i++) {
            char cs = s.charAt(i);
            counts.put(cs, counts.getOrDefault(cs, 0) + 1);
        }
        for(int i = 0; i < tlen; i++) {
            char c = t.charAt(i);
            if(!counts.containsKey(c)) return false;
            
            counts.put(c, counts.get(c) - 1);
            if(counts.get(c) < 0) {
                return false;
            }
        }

        return true;
    }
}
