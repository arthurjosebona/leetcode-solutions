class Solution {
    Map<Character, Integer> repetitions = new HashMap<>();

    public int maximumLengthSubstring(String s) {
        char[] arr = s.toCharArray();
        int min = 0;
        int max = 0;
        int size = 0;
        char limit;
        repetitions.put(arr[0], 1);
        while(true) {
            while(max < arr.length - 1) {
                char caractere = arr[max + 1];
                Integer next = repetitions.get(caractere);
                if (next == null || next == 0) {
                    max++;
                    repetitions.put(caractere, 1);
                } else if(next == 1) {
                    max++;
                    repetitions.replace(caractere, 2);
                } else {
                    limit = caractere;
                    break;
                }
            }

            if (max == arr.length - 1) {
                return max - min + 1 > size ? max - min + 1 : size;
            }

            size = max - min + 1 > size ? max - min + 1 : size;
            limit = arr[max + 1];

            while(min < max) {
                char caractere = arr[min];

                min++;
                repetitions.replace(caractere, repetitions.get(caractere) - 1);
                if (caractere == limit) {
                    break;
                }
            }
        }
    }
}