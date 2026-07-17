class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<>();
        int left = 0, right = 0, max = 0;

        while (right < s.length()) {

            while (window.contains(s.charAt(right))) {
                window.remove(s.charAt(left));
                left++;
            }

            window.add(s.charAt(right));
            right++;
            max = Math.max(max, right - left);
        }

        return max;
    }
}