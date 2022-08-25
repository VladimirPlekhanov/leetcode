package other.generateFibonacciNumbers;

import java.util.stream.Stream;

public class GenerateFibonacciNumbers {

    public int[] generateFibonacciNumbers(int num) {
        int[] arr = new int[num];
        if (num == 1) {
            arr[0] = 0;
        } else if (num == 2) {
            arr[0] = 0;
            arr[1] = 1;
        } else {
            arr[0] = 0;
            arr[1] = 1;
            for (int i = 2; i < arr.length; ++i) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
        }
        return arr;
    }

    public int[] generateFibonacciNumbersByStream(int num) {
        return Stream.iterate(new int[]{0, 1}, arr -> new int[]{arr[1], arr[0] + arr[1]})
                .limit(num)
                .map(y -> y[0]).mapToInt(Integer::intValue).toArray();
    }

}
