class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int mini = (nums.length)/3;
        for(int i =0; i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if(map.get(nums[i]) > mini && !list.contains(nums[i])){
                list.add(nums[i]);
            }
            if(list.size()==2){
                break;
            }
        }
        return list;
    }
}