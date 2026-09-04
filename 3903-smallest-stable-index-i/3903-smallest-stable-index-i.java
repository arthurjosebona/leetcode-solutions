class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int ans = -1;
        
        for (int i=0; i<nums.length; i++) {
            int smallest = -1;
            int biggest = -1;
            for (int j=0; j<nums.length; j++) {
                if (j <= i && (biggest == -1 || nums[j] > biggest)) {
                    biggest = nums[j];
                }
                if (j >= i && (smallest == -1 || nums[j] < smallest)) {
                    smallest = nums[j];
                }
            }
            int sub = biggest - smallest;
            System.out.println("Sub: " + biggest + " - " + smallest + " = " + sub);
            if (sub <= k) {
                ans = i;
                break;
            }
        }

        return ans;
    }
}