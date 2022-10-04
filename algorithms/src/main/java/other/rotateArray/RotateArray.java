package other.rotateArray;

import java.util.Arrays;

public class RotateArray {

    public int[][] rotateArray(int[][] array) {
        int a = array.length;
        int b = array[0].length;
        int[][] newArray = new int[b][a]; // b - row_number, a - column_number
        for (int i = 0; i < b; i++) {
            int n = a - 1;
            for (int j = 0; j < a; j++) {
                newArray[i][j] = array[n][i];
                n--;
            }
        }
        System.out.println(Arrays.deepToString(newArray));
        return newArray;
    }

}