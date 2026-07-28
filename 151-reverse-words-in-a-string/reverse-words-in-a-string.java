class Solution {
    public String reverseWords(String s) {
        s = cleanSpaces(s);
        int n = s.length();
        String result = "";
        char[] arr = s.toCharArray();
        //reverse the array 
        reverse(arr,0,n-1);
        int start = 0;

        for (int end = 0; end <= n; end++) {

            if (end == n || arr[end] == ' ') {
                reverse(arr, start, end - 1);
                start = end + 1;
            }
        }
        return new String(arr);
        
    }
    public void reverse (char[] arr,int left , int right){
        while(left<right){
            char temp = arr[left] ;
            arr[left] = arr[right];
            arr[right] = temp; 

            left++;
            right--;
        }
    }
    private String cleanSpaces(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0, n = s.length();

        while (i < n) {
            while (i < n && s.charAt(i) == ' ') i++;

            while (i < n && s.charAt(i) != ' ') {
                sb.append(s.charAt(i));
                i++;
            }

            while (i < n && s.charAt(i) == ' ') i++;

            if (i < n) sb.append(' ');
        }

        return sb.toString();
    }
}