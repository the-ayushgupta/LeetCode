class Container_With_Most_Water {
    public int maxArea(int[] height) {
        int h = height.length;
        int first = 0;
        int last = h-1;
        int maxArea = 0;

        while(first<last)
        {
            int currArea = Math.min(height[first], height[last])*(last-first);
            maxArea = Math.max(maxArea, currArea);

            if(height[first] < height[last])
            {
                first++;
            }
            else
            {
                last--;
            }
        }
        return maxArea;
    }
}
