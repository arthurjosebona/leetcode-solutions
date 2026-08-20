class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        

        arr1.add(nums[0]);
        arr2.add(nums[1]);

        int lastInd1 = 0;
        int lastInd2 = 0;

        for(int i=2; i<nums.length; i++) {
            if (arr1.get(lastInd1) > arr2.get(lastInd2)) {
                arr1.add(nums[i]);
                lastInd1++;
            } else {
                arr2.add(nums[i]);
                lastInd2++;
            }
        }

        int[] response = new int[nums.length];
        int i = 0;
        for (Integer in : arr1) {
            response[i++] = in; 
        }
        for (Integer in : arr2) {
            response[i++] = in;
        }

        return response;
    }
}