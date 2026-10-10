class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int maxLength = 0;
        HashSet<Character> tc = new HashSet<>();
        for(int r = 0; r < s.length(); r++) {
            while(tc.contains(s.charAt(r))) {
                tc.remove(s.charAt(l));
                l++;
            }
            tc.add(s.charAt(r));
            maxLength = Math.max(maxLength, r  - l + 1);
        }

        return maxLength;       
}
}
