class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // if(nums.length <= k) return nums;
        int[] result = new int[nums.length-k+1];

        for(int i=0; i<nums.length-k+1; i++){
            int left = i;
            int maxNum = Integer.MIN_VALUE;
            while(left<i+k && left < nums.length){
                maxNum = Math.max(maxNum,nums[left]);
                left++;
            }
            result[i] = maxNum;
        }
        return result;
    }
}
