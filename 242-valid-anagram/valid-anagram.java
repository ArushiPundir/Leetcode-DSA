class Solution {
    public boolean isAnagram(String s, String t) {
        //submit
        boolean result = false;
        Map<Character,Integer>map = new HashMap<>();
        for(char i : t.toCharArray()){
          map.merge(i, 1, Integer::sum);
        }
        Map<Character,Integer>maps = new HashMap<>();
        for(char j : s.toCharArray()){
          maps.merge(j, 1, Integer::sum);
        }
        if(map.equals(maps)){
            result = true;
        }
        return result;
    }
}