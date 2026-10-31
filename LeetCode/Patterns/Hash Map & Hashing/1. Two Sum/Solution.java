class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum;
        for(int i=0;i<nums.length;i++){
            int First=nums[i];
            for(int j=i+1;j<nums.length;j++){
                int Second=nums[j];
                sum= First+Second;
                if(target == sum){
                    return new int[] {i,j};
                }
            }
            
        }
    return new int[] {};

    }

}