class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();
        if(s.length() != t.length())
            return false;
        for(int i = 0; i<s.length();i++)
        {

            if(mapS.containsKey(s.charAt(i))) {
                mapS.replace(s.charAt(i), mapS.get(s.charAt(i)) + 1);
            }
            else {
                mapS.put(s.charAt(i), 1);
            }
            if(mapT.containsKey(t.charAt(i))) {
                mapT.replace(t.charAt(i), mapT.get(t.charAt(i)) + 1);
            }
             else {
                mapT.put(t.charAt(i), 1);
            }
        }

        if(mapS.size() != mapT.size())
        return false;
        else
        {
            for(Map.Entry<Character, Integer> entry: mapS.entrySet()) {
                if(!mapT.containsKey(entry.getKey())) {
                    return false;
                }
                else{
                    if(mapT.get(entry.getKey()) != entry.getValue())
                    return false;
                }
            }
            return true;     
        }

    }
}
