class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int ans = -1;

        int smallest = -1;
        int biggest = -1;

        for (int i=0; i<nums.length; i++) {
            
            if (i==0) {
                biggest = 0;
                smallest = 0;
                for (int j=1; j<nums.length; j++) {
                    if (nums[j] < nums[smallest]) {
                        smallest = j;
                    }
                }
            } else {
                if (nums[i] > nums[biggest]) {
                    biggest = i;
                }
                if (i - 1 == smallest) {
                    smallest = i;
                    for (int j=i+1; j<nums.length; j++) {
                        if (nums[j] < nums[smallest]) {
                            smallest = j;
                        }
                    }
                }
            }
            
            int sub = nums[biggest] - nums[smallest];
            if (sub <= k) {
                ans = i;
                break;
            }
        }

        return ans;
    }
}