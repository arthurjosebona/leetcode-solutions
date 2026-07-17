class Solution {
    public String longestPalindrome(String s) {
        char[] charArray = s.toCharArray();
        int len = 0, l = 0, r = 0, lDef = 0, rDef = 0;
        
        boolean tudoIgual = true;
        for (int i=0; i<charArray.length; i++) {
            if (charArray[i] != charArray[0]) {
                tudoIgual = false;
                break;
            }
        }
        if (tudoIgual) return s;

        
        for (int i=0; i<charArray.length; i++) {
            
            l = r = i;
            
            while (l>0 && r<charArray.length-1 && charArray[l-1] == charArray[r+1]) {
                l--;
                r++;
            }

            if (r-l+1 > len) {
                len = r-l+1;
                lDef = l;
                rDef = r;
            }
            
            l = i;
            r = i+1;
            
            
            while (l>=0 && r<charArray.length && charArray[l] == charArray[r]) {
                l--;
                r++;
            }
            l++;
            r--;


            if (r-l+1 > len) {
                len = r-l+1;
                lDef = l;
                rDef = r;
            }
        }

        return s.substring(lDef, rDef + 1);
    }
}
