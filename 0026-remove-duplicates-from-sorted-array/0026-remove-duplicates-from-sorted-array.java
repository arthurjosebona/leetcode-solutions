class Solution {
    public int removeDuplicates(int[] nums) {
        Integer last = nums[0];
        int index = 1;
        for(int i=1; i<nums.length; i++) {
            if (nums[i] != last) {
                nums[index] = last = nums[i];
                index++;
            }
        }
        return index;
    }
}