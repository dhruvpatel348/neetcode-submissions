class Solution {
    public boolean isPalindrome(String s) {
     int l = 0;
     int r = s.length() - 1;

     while (l < r) {
        if(!alphaNum(s.charAt(l))) {
            l++;
        }
        else if(!alphaNum(s.charAt(r))) {
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

    public boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}
