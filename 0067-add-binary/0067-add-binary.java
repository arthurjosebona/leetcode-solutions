import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        return toBin(
            toDec(a).add(toDec(b))
        );
    }

    private BigInteger toDec(String bin) {
        int size = bin.length();
        BigInteger decSum = BigInteger.ZERO;
        for (int i=0; i<size; i++) {
            if (bin.charAt(i) == '1') {
                decSum = decSum.add(BigInteger.TWO.pow(size - 1 - i));
            }
        }
        return decSum;
    }

    private String toBin(BigInteger dec) {
        String binResult = "";
        BigInteger two = BigInteger.TWO;
        while (!dec.equals(BigInteger.ZERO)) {
            binResult = dec.mod(two) + binResult;
            dec = dec.divide(two);
        }
        return !binResult.equals("") ? binResult : "0";
    }
}