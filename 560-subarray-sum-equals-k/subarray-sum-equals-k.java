class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int[] ps = new int[nums.length];
        ps[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            ps[i]= ps[i-1]+nums[i];
        }

        Map<Integer, Integer> map = new HashMap<>();
        for(int j=0;j<nums.length;j++){
            if(ps[j]==k){
                count++;
            }
            int val = ps[j]-k;
            if(map.containsKey(val)){
                count += map.get(val);
            }
            map.put( ps[j],map.getOrDefault(ps[j], 0) + 1);
        }
        return count;
    }
}