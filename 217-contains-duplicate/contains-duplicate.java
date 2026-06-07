class Solution {
    public boolean containsDuplicate(int[] nums) {
        //submit
        boolean result = false;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i =0; i<nums.length ; i++){
            if(map.containsKey(nums[i])){
                result = true;
            }
            map.put(nums[i],i);
        }
        return result;
    }
}