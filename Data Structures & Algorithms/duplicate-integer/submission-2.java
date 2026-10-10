class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        for (int num : nums) hs.add(num);

        if(hs.size() != nums.length) return true;
        return false;
    }
}