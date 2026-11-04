class Solution {
    public int minMoves(int[] nums) {
        int max=nums[0];
        int n=nums.length;
        for(int i=0;i<n;i++){
            max= Math.max(max,nums[i]);
        }
        int step=0;
        for(int i=0;i<n;i++){
            step += max-nums[i];
        }

        return step;
    }
}