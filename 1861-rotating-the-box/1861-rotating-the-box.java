class Solution {
    char stone = '#';
    char obstacle = '*';
    char empty = '.';
    
    public char[][] rotateTheBox(char[][] boxGrid) {
        char[][] aux = new char[boxGrid[0].length][boxGrid.length];
        
        for (int i=0; i<boxGrid[0].length; i++) {
            for (int j=0; j<boxGrid.length; j++) {
                aux[i][j] = boxGrid[boxGrid.length-1-j][i];
            }
        }
        
        for (int j=0; j<aux[0].length; j++) {
            for (int i=0; i<aux.length; i++) {
                if (i+1<aux.length && aux[i][j] == stone && aux[i+1][j] == empty) {
                    aux[i][j] = empty;
                    aux[i+1][j] = stone;
                    if (i>0 && aux[i-1][j] == stone) {
                        i -= 2;
                    }
                }
            }
        }
        
        return aux;
    }
    
}