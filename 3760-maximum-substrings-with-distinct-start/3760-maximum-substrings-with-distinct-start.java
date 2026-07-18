class Solution {
    public int maxDistinct(String s) {
        return (int) List.of(s.split("")).stream().distinct().count();
    }
}