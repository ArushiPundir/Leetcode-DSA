class Solution {
    public int firstUniqChar(String s) {
        Map <Character,Integer> maps= new HashMap<> ();
        //count the occurence 
       for(char i : s.toCharArray()){
        maps.merge(i,1,Integer::sum);
       }
       //find the first letter with occurence 1
       for (int i =0;i<s.length();i++){
        if(maps.get(s.charAt(i)) == 1){
            return i;
        }
       }
       return -1;
    }
}