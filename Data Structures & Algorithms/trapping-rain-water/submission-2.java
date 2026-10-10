class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = 1;
        
        int init = height[l];

        int count = 0;
        int tempcount = 0;

        while(r < height.length) {
            if(height[r] >= height[l]) {
                l = r;
                r++;
                count = count + tempcount;
                tempcount = 0;
            }
            else {
                tempcount = tempcount + (height[l] - height[r]);
                r++;
            }
        }
         int end = l;
        int wall = height.length - 1;
        tempcount = 0;

        for (int p = height.length - 2; p >= end; p--) {
            if (height[p] >= height[wall]) {
                count += tempcount;
                tempcount = 0;
                wall = p;
            } else {
                tempcount += height[wall] - height[p];
            }
        }
        return count;
    }
}
