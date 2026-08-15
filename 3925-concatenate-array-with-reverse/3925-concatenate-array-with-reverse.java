class Solution {
    public int[] concatWithReverse(int[] nums) {
        int j = nums.length * 2 - 1;
        int[] response = new int[nums.length * 2];
        for(int i=0; i<nums.length; i++) {
            response[i] = response[j - i] = nums[i];
        }
        return response;
    }
}