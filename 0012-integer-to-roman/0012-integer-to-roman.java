class Solution {
    public String intToRoman(int num) {
        String numero = String.valueOf(num);
        int multiplicador = (int) Math.pow(10, (numero.length() - 1));
        String results = "";

        for (int i=0; i<numero.length(); i++) {
            int caracter = Character.getNumericValue((numero.charAt(i)));
            if (caracter > 0 && caracter <= 3) {
                String roman = toRoman(multiplicador);
                for (int j=0; j<caracter; j++) {
                    results += roman;
                }
            } else if (caracter == 4) {
                String roman = (toRoman(multiplicador) + (toRoman(multiplicador * 5)));
                results += roman;
            } else if (caracter > 4 && caracter < 9) {
                String roman = toRoman(multiplicador * 5);
                for (int j=0; j<caracter-5; j++) roman += toRoman(multiplicador);
                results += roman;
            } else if (caracter == 9) {
                String roman = toRoman(multiplicador);
                roman += toRoman(multiplicador * 10);
                results += roman;
            }
            multiplicador /= 10;
        }

        return results;
    }

    public String toRoman(int num) {
        switch(num) {
            case 1: return "I";
            case 5: return "V";
            case 10: return "X";
            case 50: return "L";
            case 100: return "C";
            case 500: return "D";
            case 1000: return "M";
            default: return "";
        }
    }
}