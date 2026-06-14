class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int maxCount = 1;
        int majorityElement = nums[0];
        for(int i =1; i<=nums.length-1; i++){
            if(nums[i] == nums[i-1]){
                count++;
            }
            else{
                count = 1;
            }
            if(count > maxCount){
                maxCount = count;
                majorityElement = nums[i];
            }
        }
        return majorityElement;  
    }
}