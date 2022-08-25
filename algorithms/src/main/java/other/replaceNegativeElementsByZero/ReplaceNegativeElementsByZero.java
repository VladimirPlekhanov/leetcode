package other.replaceNegativeElementsByZero;

public class ReplaceNegativeElementsByZero {

    public int[] replaceNegativeElementsByZero(int[] array) {
        for(int i = 0; i < array.length; i++){
            if(array[i] < 0) {
                array[i] = 0;
            }
        }
        return array;
    }

}
