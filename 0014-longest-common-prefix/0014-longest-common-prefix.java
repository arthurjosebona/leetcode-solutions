class Solution {
    public String longestCommonPrefix(String[] strs) {
        boolean end = false;

        int index = 0;
        String results = "";

        try {
            while (!end) {
                char letra = strs[0].charAt(index);
                for (String s : strs) {
                    if (s.charAt(index) != letra) {
                        end = true;
                    }
                }

                if (!end) {
                    results += letra;
                    index++;
                }
            }
        } catch (Exception e) {
            
        }

        return results;
    }
}