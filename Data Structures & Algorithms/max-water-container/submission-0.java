class Solution {
    public int maxArea(int[] heights) {
        //1st and last pointer
        //1 - Curr

        int l = 0; int r = heights.length - 1;
        int finalArea = 0;
        while (l < r) {
            
            int currArea =  Math.min(heights[l], heights[r]) * (r-l);
            finalArea = Math.max(finalArea, currArea);
            if(heights[l] < heights[r]) {
                l++;
            }
            else {
                r--;
            }
        }
        return finalArea;
        
    }
}
