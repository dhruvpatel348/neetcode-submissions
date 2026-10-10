class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> counts = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            counts.put(nums[i], counts.getOrDefault(nums[i], 0) + 1);
        }

        List<Integer>[] freq = new List[nums.length + 1];

        for(int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

       for (Map.Entry<Integer, Integer> e : counts.entrySet()) {
        freq[e.getValue()].add(e.getKey());
       }

       int index = 0;

       int[] res = new int[k];

       for (int i = freq.length - 1; i > 0 && index < k; i--) {
        for (int n: freq[i]) {
            res[index++] = n;
            if(index == k) {
                return res;
            }
        }
       }
       return res;

       


    }
}
