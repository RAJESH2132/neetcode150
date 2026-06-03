class Solution {
    public int largestRectangleArea(int[] heights) {
       int n = heights.length;
       int maxArea = 0;

       for(int i=0; i<n; i++){
        int height = heights[i];

        int rightMost = i+1;
        while(rightMost < n && heights[rightMost] >= height){
            rightMost++;
        }

        int leftMost = i-1;
        while(leftMost >=0 && heights[leftMost] >= height){
            leftMost--;
        }

        rightMost--;
        leftMost++;

        int width = rightMost-leftMost+1;
        int area = height * width;

        maxArea = Math.max(maxArea, area);
       } 
       return maxArea;
    }
}
