class Solution {
    public String convert(String s, int numRows) {
        // if (numRows == 1 || s.length() <= 2) return s;

        List<Character[]> array = new ArrayList<>();

        int counter = 0;

        while(counter < s.length()) {
            Character[] temp1 = new Character[numRows];
            for (int i=0; i<numRows && counter < s.length(); i++) {
                temp1[i] = s.charAt(counter++);
            }
            array.add(temp1);

            int inicioDiag = numRows - 2;

            for (int i=0; i<numRows - 2 && counter < s.length(); i++) {
                Character[] temp2 = new Character[numRows];
                temp2[inicioDiag--] = s.charAt(counter++);
                array.add(temp2);
            }
        }

        String results = "";

        // Loop final para concatenar string
        for (int i=0; i<numRows; i++) {
            for (int j=0; j<array.size(); j++) {
                results += (array.get(j)[i]) == null ? "" : (array.get(j)[i]).toString();
            }
        }

        return results;
    }
}