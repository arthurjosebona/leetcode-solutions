class Solution {
    public int subtractProductAndSum(int n) {
        int resMul = 1;
        int resSum = 0;
        while(n>0) {
            int lastDigit = n % 10;
            n /= 10;
            resMul *= lastDigit;
            resSum += lastDigit;
        }

        return resMul - resSum;
    }
}