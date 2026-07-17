class Solution {
    public int romanToInt(String s) {
        char[] charArray = s.toCharArray();
        int fst=0, snd=0, num=0;
        for (int i=0; i<charArray.length; i++) {
            fst = getRoman(charArray[i]);
            snd = i<charArray.length-1 ? getRoman(charArray[i+1]) : 0;
            if (fst < snd) {
                i++;
                snd -= fst;
                num += snd;
            } else {
                num += fst;
            }
        }
        return num;
    }

    public int getRoman(char c) {
        int retorno;
        switch(c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return -1;
        }
    }
}