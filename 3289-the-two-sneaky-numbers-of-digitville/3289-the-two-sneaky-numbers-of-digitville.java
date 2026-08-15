class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] repeateds = new int[2];
        int[] counts = new int[nums.length];
        int index = 0;
        for(int i : nums) {
            if (counts[i] == 1) repeateds[index++] = i;
            counts[i] = 1; 
        }
        return repeateds;
    }
}