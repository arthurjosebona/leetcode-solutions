class Solution {
    public String addBinary(String a, String b) {
        Stack<Character> result = new Stack<>();

        int indexA = a.length() - 1;
        int indexB = b.length() - 1;

        boolean actA, actB;
        boolean auxSum = false;

        while(indexA>=0 || indexB>=0 || auxSum) {
            actA = indexA >= 0 ? a.charAt(indexA--) == '1' : false;
            actB = indexB >= 0 ? b.charAt(indexB--) == '1' : false;
            if (actA && actB) {
                if (auxSum) {
                    System.out.println("1:1");
                    result.push('1');
                } else {
                    auxSum = true;
                    System.out.println("2:0");
                    result.push('0');
                }
            } else if (actA || actB) {
                if (auxSum) {
                    System.out.println("3:0");
                    result.push('0');
                } else {
                    System.out.println("4:1");
                    result.push('1');
                }
            } else {
                if (auxSum) {
                    System.out.println("5:1");
                    result.push('1');
                    auxSum = false;
                } else {
                    System.out.println("6:0");
                    result.push('0');
                }
            }
        }

        String response = "";

        int size = result.size();
        for (int i=0; i<size; i++) {
            response += result.pop();
        }

        return response;
    }
}