class Solution {
    int[] finalLength;

    public String encode(List<String> strs) {
        finalLength = Arrays.copyOf(recordLength(strs), recordLength(strs).length);
        return String.join("", strs);
        
    }

    public List<String> decode(String str) {
        List<String> returnDecoded = new ArrayList<>();
        int index = 0;
        for(int i=0; i< finalLength.length; i++) {
            returnDecoded.add(str.substring(index, index + finalLength[i]));
            index = index + finalLength[i];
        }
        return returnDecoded;
    }

    private int[] recordLength(List<String> strs) {
        int[] returnLength = new int[strs.size()];
        for(int i=0; i< returnLength.length; i++) {
            returnLength[i] = strs.get(i).length();
        }
        return returnLength;
    }
}
