class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;

        //initialy the width would be max and heights would be unknown

        int initmax = Math.min(heights[l], heights[r]) * (r - l);

        while(l < r) {
            if(Math.min(heights[l], heights[r]) == heights[l]) {
                l++;
                initmax = Math.max(initmax, Math.min(heights[l], heights[r]) * (r - l));
            }
            else {
                r--;
                 initmax = Math.max(initmax, Math.min(heights[l], heights[r]) * (r - l));
            }
        }

        return initmax;
    }
}
