class Solution {
    public int findGCD(int[] nums) {
        int biggest = nums[0];
        int smallest = nums[0];
        for (int i : nums) {
            biggest = i > biggest ? i : biggest;
            smallest = i < smallest ? i : smallest;
        }

        int rest = biggest % smallest;

        while(rest != 0) {
            int aux = smallest;
            smallest = rest;
            biggest = aux;
            rest = biggest % smallest;
        }

        return smallest;
    }
}