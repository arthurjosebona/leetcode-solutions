class Solution {
    public int searchInsert(int[] nums, int target) {
        int floor = 0;
        int ceiling = nums.length - 1;
        int mid = (ceiling + floor) / 2;
        int actual;
        while (ceiling >= floor) {
            actual = nums[mid];
            if (actual == target) return mid;
            else if (actual > target) {
                ceiling = mid - 1;
            }
            else {
                floor = mid + 1;
            }
            
            mid = (ceiling + floor) / 2;
        }

        return floor;
    }
}