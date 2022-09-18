package other.rotateArray;

public class RotateArray {

    public int[][] rotateArray(int[][] array) {
        int a = array.length;
        int b = array[0].length;
        int[][] newArray = new int[b][a]; // b - row length, a - column length
        for (int i = 0; i < b; i++) {
            int n = a - 1;
            for (int j = 0; j < a; j++) {
                newArray[i][j] = array[n][i];
                n--;
            }
        }
        return newArray;
    }

}