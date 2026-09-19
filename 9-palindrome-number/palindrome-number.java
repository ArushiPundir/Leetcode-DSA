class Solution {
    public boolean isPalindrome(int x) {
       int y = x;
       int rev = 0;
       while(y>0){
            int rem = y%10;
            rev = rev * 10 + rem; 
            y = y / 10;
       }

       if(x != rev){
        return false;
       }
       return true;
    }
}