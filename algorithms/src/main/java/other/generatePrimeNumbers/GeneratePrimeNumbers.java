package other.generatePrimeNumbers;

public class GeneratePrimeNumbers {

    public int[] generatePrimeNumbers(int num) {
        int[] array = new int[num];

        int arrayIndex = 0;
        int primeValue = 2;

        while (arrayIndex < array.length) {
            int primeValueCounter = 1;
            int divisorNumber = 0; //positive divisors other than one and itself (can be just 2)
            while (primeValueCounter <= primeValue) {
                if (primeValue % primeValueCounter == 0) {
                    divisorNumber++;
                }
                primeValueCounter++;
            }
            if (divisorNumber == 2) {
                array[arrayIndex] = primeValue;
                arrayIndex++;
            }
            primeValue++;
        }
        return array;
    }

}
