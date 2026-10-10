class Solution {
    public boolean isPalindrome(String s) {
     int l = 0;
     int r = s.length() - 1;

     while (l < r) {
        if(!String.valueOf(s.charAt(l)).matches("^[a-zA-Z0-9]+$")) {
            l++;
        }
        else if(!String.valueOf(s.charAt(r)).matches("^[a-zA-Z0-9]+$")) {
            r--;
        }
        else {
            if(Character.toLowerCase(s.charAt(l)) == Character.toLowerCase(s.charAt(r))) {
                l++;
                r--;
            }
            else return false;
        }
     }
     return true;   
    }
}
