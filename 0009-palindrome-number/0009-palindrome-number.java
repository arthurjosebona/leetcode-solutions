class Solution {
    public boolean isPalindrome(int x) {
        if (x<0 || (x%10 == 0 && x != 0)) return false;

        int temp = x, multiplicador = 1, divisor = 1;
        while (temp>=10) {
            temp /= 10;
            multiplicador *= 10;
        }
        
        int ultimo = 0, primeiro = 0;

        boolean primeiraIteração = true;
        
        while (multiplicador>=10) {
            ultimo = x % 10;
            primeiro = divisor < 10 ? x / multiplicador : x / multiplicador % divisor;
            if (primeiro >= 10) primeiro %= 10;

            if (!(ultimo == primeiro)) {
                return false;
            }
            x /= 10;
            multiplicador /= 100;
            divisor *= 10;
        }
        return true;
    }
}