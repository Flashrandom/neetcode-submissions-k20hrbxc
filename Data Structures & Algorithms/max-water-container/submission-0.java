class Solution {
    public int maxArea(int[] heights) {
        int count_water_max= 0;
        int left = 0;
        int right= heights.length-1;
        while(left<right){
            int count = Math.min(heights[left], heights[right]) * (right-left);
            if(count> count_water_max){
                count_water_max= count;
            }
            if( heights[left] < heights[right]){
                left++;
            }else if(heights[left] > heights[right] ){
                right--;
            }else{
                left++;
                right--;
            }
        }

        return count_water_max;
    }
}
