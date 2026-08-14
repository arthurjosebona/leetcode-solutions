class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> indexes = new ArrayList<>();
        int i = 0;
        for (String w : words) {
            char[] turned = w.toCharArray();
            for (char c : turned) {
                if (c == x) {
                    indexes.add(i);
                    break;
                }
            }
            i++;
        }
        return indexes;
    }
}