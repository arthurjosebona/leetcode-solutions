class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;

        for (String s : operations) {
            char c1 = s.charAt(0);
            if (c1 == 'X') {
                char c2 = s.charAt(1);
                if (c2 == '+') {
                    x++;
                } else {
                    x--;
                }
            } else {
                if (c1 == '+') {
                    x++;
                } else {
                    x--;
                }
            }
        }
        return x;
    }
}