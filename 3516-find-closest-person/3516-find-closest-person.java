class Solution {
    public int findClosest(int x, int y, int z) {
        return Math.abs(z-x) < Math.abs(y-z) ? 1 : Math.abs(z-x) == Math.abs(y-z) ? 0 : 2; 
    }
}