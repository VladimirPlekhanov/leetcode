package other.sumElementsOnEvenPositions;

public class SumElementsOnEvenPositions {

    public int sumElementsOnEvenPositions(int[] array) {
        int result = 0;
        for(int i = 0; i < array.length; i++){
            if(i % 2 == 0){
                result += array[i];
            }
        }
        return result;
    }

}
