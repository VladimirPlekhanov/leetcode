package smallestEvenMultiple;

public class SmallestEvenMultiple {

    // Constant complexity - O(1)

    public int smallestEvenMultiple(int n) {
        return n % 2 == 0 ? n : n * 2;
    }

}
