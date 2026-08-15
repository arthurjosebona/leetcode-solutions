class Solution {
    public int scoreOfString(String s) {
        char[] chars = s.toCharArray();
        int sum = 0;
        int last = (int) chars[0];
        for(int i=1; i<chars.length; i++) {
            int actual = (int) chars[i];
            sum += Math.abs(last - actual);
            last = actual;
        }
        return sum;
    }
}