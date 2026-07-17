class Solution {
    public boolean hasSameDigits(String s) {
        while (s.length() > 2) {
            String temp = "";
            for (int i=0; i < s.length() - 1; i++) {
                int sum = (s.charAt(i) - '0') + (s.charAt(i+1) - '0');
                temp += (sum % 10);
            }
            s = temp;
        }
        return (s.charAt(0) == s.charAt(1)) ? true : false;
    }
}