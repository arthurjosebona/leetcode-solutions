class Solution {
    public int totalMoney(int n) {
        int semanas = n / 7;
        int quebrados = n % 7;
        int contador = 1;
        int sum = 0;

        while (contador <= semanas) {
            for (int i=0; i<7; i++) {
                sum += contador+i;
            }
            contador++;
        }

        for(int i=0; i<quebrados; i++) {
            sum += contador + i;
        }

        return sum;        
    }
}