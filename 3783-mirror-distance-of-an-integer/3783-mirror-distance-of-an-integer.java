class Solution {
    public int mirrorDistance(int n) {
        char[] original = String.valueOf(n).toCharArray();
        String reverse = "";
        for(int i=original.length - 1; i>=0; i--) {
            reverse += original[i];
        }
        return Math.abs(n - Integer.parseInt(reverse));
    }
}