class Solution {
    int[] scores = new int[10];
    public int digitFrequencyScore(int n) {
        char[] caracteres = String.valueOf(n).toCharArray();

        for(char c : caracteres) {
            int num = c - '0';
            scores[num]++;
        }

        int sum = 0;
        for(int i=1; i<10; i++) {
            sum += scores[i] * i;
        }

        return sum;
    }
}