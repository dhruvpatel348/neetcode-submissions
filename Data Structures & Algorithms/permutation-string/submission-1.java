class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> subMap = new HashMap<>();

        for(int i = 0; i<s1.length(); i++) {
            subMap.put(s1.charAt(i), subMap.getOrDefault(s1.charAt(i), 0) + 1);
        }

        for(int r=0; r<s2.length()-s1.length()+1; r++) {
            HashMap<Character, Integer> permMap = new HashMap<>();
            for(int j = r; j< r+s1.length(); j++) {
                permMap.put(s2.charAt(j), permMap.getOrDefault(s2.charAt(j), 0) + 1);
            }
            if(permMap.equals(subMap)) {
                return true;
            }
        }
        return false;
        
    }
}
