class Solution {
    public int reverse(int x) {
        String f = "";
        
        if (x<0) {
            x *= -1;
            f += "-";
        }

        String toStr = String.valueOf(x);

        
        for (int i=toStr.length()-1; i>=0; i--) {
            f += toStr.charAt(i);
        }

        
        try {
            return Integer.parseInt(f);
        } catch (Exception e) {
            return 0;
        }

    }
}