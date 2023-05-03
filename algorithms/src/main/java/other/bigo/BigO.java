package other.bigo;

public class BigO {

    // Constant complexity - O(1)
    public int getLastElement(int[] array) {
        return array.length - 1;
    }

    // Linear complexity - O(n)
    public int getSumOfArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    // Logarithmic complexity - O(log n)
    public int search(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        int mid;

        while (left <= right) {
            mid = Math.round((right - left) / 2) + left;

            if (target == array[mid]) {
                return mid;
            } else if (target < array[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    // Quadratic complexity - O(n^2)
    public void getMultiplyList(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print("i * j = " + i * j);
            }
        }
    }

    // Cubic complexity - O(n^3)
    // When we have nested three loops

    // Exponential complexity O(2^n)
    public int getFib(int n) {
        if (n < 2) {
            return n;
        }
        return getFib(n - 1) + getFib(n - 2);
    }

    // Factorial complexity O(n!)
    // Travelling salesman problem or TCP

}
