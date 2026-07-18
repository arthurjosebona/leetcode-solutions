class Solution {
    public int[] plusOne(int[] digits) {
        int index = digits.length - 1;
        while(index>=0) {
            if (digits[index] == 9) {
                digits[index] = 0;
                index--;
            } else {
                digits[index]++;
                return digits;
            }
        }
        int[] retorno = new int[digits.length+1];

        retorno[0] = 1;
        for (int i=1; i<retorno.length; i++) {
            retorno[i] = 0;
        }

        return retorno;

    }
}