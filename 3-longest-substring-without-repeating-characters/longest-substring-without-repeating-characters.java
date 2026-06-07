class Solution {
    public int lengthOfLongestSubstring(String s) {
        //submit
        int j=0,maxlen=0;
        Set<Character> set = new HashSet<>();
        for(int i = 0; i<s.length(); i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(j));
                j++;
            }
            set.add(s.charAt(i));
            maxlen = Math.max(maxlen,set.size());
        }
        return maxlen;
    }
}