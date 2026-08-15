class Solution {
    Map<Integer, Integer> scores = new HashMap<>(
        Map.of(0,0,1,0,2,0,3,0,4,0,5,0,6,0,7,0,8,0,9,0)
    );
    public int digitFrequencyScore(int n) {
        char[] caracteres = String.valueOf(n).toCharArray();

        for(char c : caracteres) {
            int num = c - '0';
            scores.put(num, scores.get(num) + 1);
        }

        int sum = 0;
        for(int i=1; i<10; i++) {
            sum += scores.get(i) * i;
        }

        return sum;
    }
}