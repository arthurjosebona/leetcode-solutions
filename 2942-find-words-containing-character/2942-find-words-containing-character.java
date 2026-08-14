class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> indexes = new ArrayList<>();
        int i = 0;
        for (String w : words) {
            if (w.contains(x + "")) {
                indexes.add(i);
            }
            i++;
        }
        return indexes;
    }
}