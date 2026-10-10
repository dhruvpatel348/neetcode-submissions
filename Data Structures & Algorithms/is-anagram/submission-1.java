class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> counts = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            counts.put(s.charAt(i), counts.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(int i = 0; i < t.length(); i++) {
            if(!counts.containsKey(t.charAt(i))) return false;
            
            counts.put(t.charAt(i), counts.get(t.charAt(i)) - 1);
            if(counts.get(t.charAt(i)) < 0) {
                return false;
            }
        }

        return true;
    }
}
