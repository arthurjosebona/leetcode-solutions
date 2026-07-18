class Solution {
    private final String abc = "abcdefghijklmnopqrstuvwxyz";
    public int maxDistinct(String s) {
        int count = 0;
        for (int i=0; i<26; i++) {
            if (s.contains(String.valueOf(abc.charAt(i)))) count++;
        }
        return count;
    }
}