class Solution {
    public int[] twoSum(int[] nums, int target) {
    //     HashMap<Integer, Integer> hmap = new HashMap<>();

    //     for(int i = 0; i < nums.length; i++) {
    //         int diff = target - nums[i];
    //         if(!hmap.containsKey(diff)) {
    //             hmap.put(nums[i], i);
    //         }
    //         else {
    //             return new int[]{Math.min(i, hmap.get(diff)), Math.max(i, hmap.get(diff))};
    //         }
    //     }
    //     return new int[0];
    // }

    HashMap<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (prevMap.containsKey(diff)) {
                return new int[] { prevMap.get(diff), i };
            }

            prevMap.put(num, i);
        }

        return new int[] {};
    }
}
